package stepDefinition2;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects2.HomePage;
import pageObjects2.LoginPage;

public class StepDefinition2 {

	static WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;

	@Before
	public void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		// WebDriverManager manager = WebDriverManager.chromedriver();
		// manager.config().setChromeDriverVersion("116.0.5845.97");
		// manager.setup();
		// ChromeOptions options = new ChromeOptions();
		// driver = new ChromeDriver(options);
		// driver.manage().window().maximize();
		// Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		// String browserName = caps.getBrowserName();
		// String browserVersion = caps.getVersion();
		// System.out.println("---------- Please check Browser Name and Version
		// " + browserName + " " + browserVersion);
	}

	@Given("^Launch the Application$")
	public void launch_the_Application() {
		driver.get("https://demo.wpjobboard.net/wp-admin");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@When("^User Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_Username_and_Password(String username, String password) {
		loginpage = new LoginPage(driver);
		loginpage.Enter_Username_Password(username, password);
	}

	@And("^User Clicks Login button$")
	public void user_Clicks_Login_button() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		loginpage.Click_Login();
	}

	@Then("^User able to go to Home Page successfully$")
	public void user_able_to_go_to_Home_Page_successfully() {
		homepage = new HomePage(driver);
		homepage.userOnHomePage();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
