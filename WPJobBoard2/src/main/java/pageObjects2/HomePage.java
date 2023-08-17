package pageObjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id='wp-admin-bar-my-account']/a/span")
	private WebElement txt_userpagename;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userOnHomePage() {
		txt_userpagename.isDisplayed();
	}
}
