package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement signIn;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	public LoginPage loginToApplication(String uname, String pass){
		username.sendKeys(uname);
		password.sendKeys(pass);
		signIn.click();
		return new LoginPage();
	}
	
	public LoginPage click(){
		return new LoginPage();
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
}
