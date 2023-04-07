package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver(); // upcasting
				
				driver.get("https://nxtgenaiacademy.com/alertandpopup/");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[@name = 'promptalertbox1234']")).click();
				Thread.sleep(3000);
				
				org.openqa.selenium.Alert Alt=driver.switchTo().alert();
				Alt.sendKeys("Hi");
				Thread.sleep(3000);
				Alt.accept();
				
				
				
				
	}

}
