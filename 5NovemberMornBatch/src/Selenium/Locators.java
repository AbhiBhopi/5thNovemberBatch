package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		Thread.sleep(1000);
		
}
}