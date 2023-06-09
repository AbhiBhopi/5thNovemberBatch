package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Login {
	public static void main(String[] args) throws InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver(); // upcasting
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
	driver.get("https://www.facebook.com/login.php");
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);// deprecated method
	
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abhi.bhopi@gmail.com");
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abhi.bhopi@gmail.com");
	//Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@1234");
	
	//Thread.sleep(2000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//but[@value='1']"))).click();
	//driver.findElement(By.xpath("//button[@value='1']")).click();

}
}