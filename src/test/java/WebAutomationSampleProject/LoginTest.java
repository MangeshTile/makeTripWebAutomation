package WebAutomationSampleProject;




import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomClass_Module_Pages.LoginPage;


import java.time.Duration;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    protected   WebDriver driver;
    public static String  expectedTitle  = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";


    @BeforeMethod
    public void setup() {
        loginPage = new LoginPage(driver);
    }


    @Test
    public void TC_Verify_MakeMyTrip_PageTitle() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String getActualTitle = driver.getTitle();
        System.out.println("Page title is: " + getActualTitle);
        Assert.assertEquals(getActualTitle , expectedTitle , "Title Mis-match" );
    }
    
    
}


