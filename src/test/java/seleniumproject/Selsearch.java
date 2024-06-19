package seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selsearch {
	
	public static void main(String args[]) {
		
		
		//instantiating web driver
		WebDriver driver = new ChromeDriver();
		//launching the browser
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//sending text in search box
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		System.out.println(elements.size());
		//select of option from list
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
			
		}
	
		
		
	}
	
	

}
