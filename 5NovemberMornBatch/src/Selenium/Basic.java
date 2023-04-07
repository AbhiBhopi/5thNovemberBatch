package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
	driver.findElement(By.xpath(null));
      
//           Dimension d = new Dimension(515, 100);
//           driver.manage().window().setSize(d);
//           
//           Thread.sleep(5000);
//           
//           Point p = new Point(500, 200);
//           driver.manage().window().setPosition(p);
           
//          System.out.println(driver.manage().window().getSize());
//          Thread.sleep(2000);
		
		
//		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
		
		
	}
	
	

}
