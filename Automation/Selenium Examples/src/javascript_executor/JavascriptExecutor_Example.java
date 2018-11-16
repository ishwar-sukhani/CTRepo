package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JavascriptExecutor_Example {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("D:/Workspace/Automation/Selenium Examples/Tables.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='ddlNumber']/option[@value='60']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(" arguments[0].scrollIntoView(true) ", element );
		
/*		
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();

*/		
		Thread.sleep(50000);
		driver.quit();
	}

}
