package pageObjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@id='user_login']")
	private WebElement txt_username;

	@FindBy(xpath = "//*[@id='user_pass']")
	private WebElement txt_password;

	@FindBy(xpath = "//*[@id='wp-submit']")
	private WebElement btn_login;

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Enter_Username_Password(String username, String password) {
		txt_username.clear();
		txt_username.sendKeys(username);
		txt_password.clear();
		txt_password.sendKeys(password);
	}

	public void Click_Login() {
		btn_login.click();
	}
}
