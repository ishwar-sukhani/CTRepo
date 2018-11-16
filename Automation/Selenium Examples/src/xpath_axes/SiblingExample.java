package xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingExample {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:/Workspace/Automation/Selenium Examples/Tables.html");
		Thread.sleep(5000);
		String savingsOfJan = driver.findElement(By.xpath("//td[contains(text(),'January')]/following-sibling::td")).getText();
		//String savingsOfJan = driver.findElement(By.xpath("//td[contains(text(),'January')]/preceding-sibling::td")).getText();
		System.out.println(savingsOfJan);
		driver.quit();
	}

}
