package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class LoginTest {

	static WebDriver driver;
	static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		LoginPage objLogin = new LoginPage(driver);
		objLogin.loginToApplication("ishwar", "ishwar")
				.click()
				.getTitle();
		//System.out.println("Title isssssss: "+ driver.findElement(By.xpath("//title")).getAttribute("innerText"));
		if(objLogin.getTitle().contains("Find a Flight: Mercury Tours:"))
			System.out.println("Login Successful");
		driver.close();
	}

}
