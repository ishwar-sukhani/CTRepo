package testGroup.mavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AppTest{
	private WebDriver driver;
	
	@Test
	public void loadApp(){
		System.setProperty("webdriver.chrome.driver", "D:/Workspace/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pgs.citiustech.com");
        driver.findElement(By.id("txtLoginName")).sendKeys("ishwars");
		driver.findElement(By.id("txtPassword")).sendKeys("password_9876");
		driver.findElement(By.id("cmdSubmit")).click();
        driver.findElement(By.id("ctl00_LinkButton1")).click();
        driver.findElement(By.id("ctl00_cmdYes")).click();
        
        /*if(driver != null)
        	driver.quit();
        Assert.assertEquals(12, 12);
        System.out.println("Browser Closed... Assert Passed... Test Passed... Bye Bye");*/
	}
}
