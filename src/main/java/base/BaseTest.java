package base;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	Logger log =  Log.getLogger(BaseTest.class);
	
	public BaseTest() 
	{
		try 
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/config/config.properties");
			prop.load(fis);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void initialization() 
	{
		 log.info("Initializing ChromeDriver...");
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/dsdsd/MakeMyTripAutomationProject/src/main/java/resources/driver/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("driver.gecko.driver", "D:\\dsdsd\\MakeMyTripAutomationProject\\src\\main\\java\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Browser launched successfully.");
	}
	
	
//	@AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.close();
//            log.info("Browser closed.");
//        }
//    }

}
