package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Example2 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		WebElement element = driver.findElement(By.xpath("//*[@id='mCSB_4_container']/p[starts-with(text(),'Sed ut perspiciatis unde')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(" arguments[0].scrollIntoView(true) ", element );
		System.out.println(element.getText());
	}

}
