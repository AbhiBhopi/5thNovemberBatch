package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		Thread.sleep(1000);
		
	//	driver.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,300)"); // scroll down
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(0,-300)"); // scroll up
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(3000,0)"); // scroll right
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(-3000,0)"); // scroll left
		
		
}
	
	

}
