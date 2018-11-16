package home.assignment5;

import org.openqa.selenium.WebDriver;

import com.driver.init.Browsers;

public class Test {

	public static void main(String[] args) {
				
		WebDriver driver = Browsers.initializeChrome();
		driver.manage().window().maximize();
		driver.get("https://www.learn-automation.com");
		
	}

}
