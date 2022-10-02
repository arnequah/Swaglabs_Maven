package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// ****************************** Page Objects **************************

	@FindBy(id = "user-name")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement LoginBtn;

	public LoginPage(WebDriver baseDriver) {

		this.driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}

	// *************************** Methods ***********************************
	public void Login(String UserNameVal, String PassVal) {

		UserName.sendKeys(UserNameVal);

		Password.sendKeys(PassVal);

		LoginBtn.click();

	}

}
