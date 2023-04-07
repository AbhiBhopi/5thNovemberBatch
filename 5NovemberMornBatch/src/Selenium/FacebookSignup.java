package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.navigate().refresh();
		
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com/reg/");
		Thread.sleep(5000);
		
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[contains(@class,' _2ph-')])[1]")).sendKeys("RAM");
		
	
}
}