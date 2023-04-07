package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select  s = new Select(Month);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result == true) {
			System.out.println("The given listbox is multiselected");
		}
		else {
			System.out.println("Listbox is single selected");
		}
		
		
		
		
		
		

}
}