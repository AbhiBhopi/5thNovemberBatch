package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		// WebElement cutomGen = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		//boolean result = cutomGen.isDisplayed();
		//System.out.println(result);
		
//		WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
//
//		String result = text.getText();
//		System.out.println(result);
		
	WebElement ele = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
		
		String attribute = ele.getAttribute("autocomplete");
		System.out.println(attribute);
		
		
		
}
}