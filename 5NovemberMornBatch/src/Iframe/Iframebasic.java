package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebasic {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver(); // upcasting
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
				
				//driver.findElement(By.xpath("//button[@type='button']")).click();
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				
				driver.switchTo().frame(iframe);//changed selenium focus from main page to iframe
				
				driver.findElement(By.xpath("//button[@type='button']")).click();
				
				driver.switchTo().defaultContent();// selenium focused changed to Main page
				
				//driver.switchTo().parentFrame();
				
				driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}

}
