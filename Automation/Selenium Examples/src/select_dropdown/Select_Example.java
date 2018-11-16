package select_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Example {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:/Workspace/Automation/Selenium Examples/Tables.html");
		Thread.sleep(5000);
		Select sel = new Select(driver.findElement(By.id("ddlNumber")));
		sel.selectByVisibleText("100");
		Thread.sleep(5000);
		driver.close();
	}

}
