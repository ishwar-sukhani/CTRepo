package com.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void initiateWebBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
	}

	public static void playWithTable(){
		
	}
	
	public static void main(String[] args) {
	}
}
