package testGroup.mavenSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:/Workspace/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pgs.citiustech.com");
        driver.quit();
    }
}
