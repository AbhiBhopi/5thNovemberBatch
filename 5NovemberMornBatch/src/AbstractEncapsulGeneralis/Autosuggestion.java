package AbstractEncapsulGeneralis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Oneplus");
		
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		
		for(int i=0;i< options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
//		for(WebElement Eachoption : options) { // advance for loop
//			
//			System.out.println(Eachoption.getText());
//		}
//		
}

}
