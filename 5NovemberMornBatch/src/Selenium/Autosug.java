package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosug {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@class='gLFyfgsfi']")).sendKeys("oneplus");


}
}