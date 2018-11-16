package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassB {

 WebDriver driver;
	
 @Test
 public void methodB1() {
	 System.out.println("Statement 1 in Class B, method B1");
	 System.out.println("Statement 2 in Class B, method B1");
	 System.out.println("Statement 3 in Class B, method B1");
	 /*
	 System.setProperty("webdriver.firefox.marionette", "D:\\Workspace\\Selenium_Jars\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("https://www.hdfcbank.com/");
	 */
 }
	  
 @Test
 public void methodB2() {
	 System.out.println("Statement 1 in Class B, method B2");
	 System.out.println("Statement 2 in Class B, method B2");
	 System.out.println("Statement 3 in Class B, method B2");
 }
}
