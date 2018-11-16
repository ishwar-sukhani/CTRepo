package com.table;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortWebTable {
	
	private static WebDriver driver;
	
	public static void initiateWebBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
	
	public static void fetchTableAndSort() throws InterruptedException{
		// Fetch table data for Position column
		driver.navigate().refresh();
		LinkedList<String> positionsBeforeSort = new LinkedList<String>();
		List<WebElement> positionColumnData = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
		for(WebElement e : positionColumnData){
			positionsBeforeSort.add(e.getText().trim());
			System.out.println(positionsBeforeSort);
		}

		// Clicking on sortColumn will sort the data on UI
		String sortColumn = "Position";
		Thread.sleep(10000);
		driver.findElement(By.xpath("//table[@id='example']//th[contains(text(),'"+sortColumn+"')]")).click();
		System.out.println("----------------------------------------------------------------------------");
		LinkedList<String> positionsAfterSort = new LinkedList<String>();
		List<WebElement> positionColumnData2 = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
		for(WebElement e : positionColumnData2){
			positionsAfterSort.add(e.getText().trim());
			//System.out.println(positionsAfterSort);
		}		
		System.out.println("----------------------------------------------------------------------------");
		Collections.sort(positionsBeforeSort);
		System.out.println(positionsBeforeSort);
		System.out.println(positionsAfterSort);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(positionsBeforeSort == positionsAfterSort);
		if(positionsBeforeSort.equals(positionsAfterSort)){
			System.out.println("TRUE");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		initiateWebBrowser();
		fetchTableAndSort();
		//closeBrowser();
	}

}
