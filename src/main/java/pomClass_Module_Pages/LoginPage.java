package pomClass_Module_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//div//img[@class='appendLeft15 mousePointer signInByEmailButton']")
	private WebElement email_Button;

	@FindBy (xpath = "//div//input[@class='font14 fullWidth']")
	private WebElement email_Feild;

	@FindBy (xpath = "//button/span[text()='Continue']")
	private WebElement continue_Button;

	public void clickEmail_Button()
	{
		email_Button.click();
	}

	public void clickEmail_Feild(String userEmail)
	{
		email_Feild.click();
		email_Feild.sendKeys(userEmail);
	}

	public void clickContinue_Button()
	{
		continue_Button.click();
	}
	}



