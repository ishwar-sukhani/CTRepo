package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
// Selenium Imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

// Cucumber Imports
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PGS_Smoke_Test {
	
	WebDriver driver;
	
	@Given("^chrome browser and application$")
	public void chrome_browser_and_application() {
		TakesScreenshot screenshot = new TakesScreenshot() {
			
			public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		ExpectedCondition<Boolean> obj = new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				return true;
			}
		};
		wait.until(obj);
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pgs.citiustech.com");
	}

	@When("^correct username and password is entered$")
	public void correct_username_and_password_is_entered() {
		driver.findElement(By.id("txtLoginName")).sendKeys("ishwars");
		driver.findElement(By.id("txtPassword")).sendKeys("password_9876");
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() {
		driver.findElement(By.id("cmdSubmit")).click();
	}
}
