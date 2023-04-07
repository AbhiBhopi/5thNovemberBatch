package Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableElement {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(1000);
		
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		//System.out.println(noOfRows.size()); //7
		for(int i =1;i<noOfRows.size();i++) {
		List<WebElement> noOfcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		//System.out.println(noOfcells.size());
		for(int cell =1;cell<=noOfcells.size();cell++) {
			System.out.print(noOfcells.get(cell).getText()+"  ");
		}
		System.out.println();
		}		
		
}

}
