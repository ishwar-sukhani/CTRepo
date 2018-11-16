package firstexample;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class FirstTest {
	
  WebDriver driver;
  By username = By.name("userName");
  By password = By.name("password");
  By signOn = By.name("login");
  By signOff = By.linkText("SIGN-OFF");
	
  @Test
  public void demoTours() {
	  
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(username).sendKeys("ishwar");
	  driver.findElement(password).sendKeys("ishwar");
	  driver.findElement(signOn).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.elementToBeClickable(signOff));
	  WebElement element = driver.findElement(signOff);
	  
	  if(element.isDisplayed())	
		  System.out.println("LOGIN SUCCESSFUL");
		  
  }
  
  @Test
  public void toolsQA(){
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Ishwar");
		driver.findElement(By.name("lastname")).sendKeys("Sukhani");
		driver.findElement(By.id("exp-4")).click();
		System.out.println("ALL ACTIONS PERFORMED for ToolsQA");
	}
  
  @BeforeSuite
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterMethod() {
	  
	  driver.quit();
  }

}
