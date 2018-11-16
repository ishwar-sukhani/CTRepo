package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClassA {
  
  WebDriver driver;

  @AfterMethod
  public void tearDown(){
	  System.out.println("QUIT DRIVER");
  }
  
  
  @Test
  public void methodA1() {
	  System.out.println("Statement 1 in Class A, method A1");
	  System.out.println("Statement 2 in Class A, method A1");
	  System.out.println("Statement 3 in Class A, method A1");
	  /*
	  System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  */
  }
  
  @Test
  public void methodA2() {
	  System.out.println("Statement 1 in Class A, method A2");
	  System.out.println("Statement 2 in Class A, method A2");
	  System.out.println("Statement 3 in Class A, method A2");
	  /*
	  System.setProperty("webdriver.ie.driver", "D:\\Workspace\\Selenium_Jars\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get("http://newtours.demoaut.com/");
	  */
  }
}
