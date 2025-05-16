package WebAutomationSampleProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pomClass_Module_Pages.LoginPage;


import java.time.Duration;

public class TC_01_Verfiy_Login_Page extends BaseTest
{
    LoginPage loginPage;
    

    @BeforeMethod
    public void setup() {
        loginPage = new LoginPage(driver);
    }


    @Test
    public void TC_Verify_MakeMyTrip_PageTitle()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage.clickEmail_Button();
        loginPage.clickEmail_Feild("mangesh.softteach@gmail.com");
        loginPage.clickContinue_Button();

    }
}
