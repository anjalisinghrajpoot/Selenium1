package seleniumproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smartphones under 30000");
		driver.findElement(By.id("nav-search-submit-button")).click();		
		Thread.sleep(1000);
		String text = (driver.findElement(By.xpath("//span/div/h1/div/div/div/div/span[1]")).getText());
		
		System.out.println(text);
		if(text.contains("-") && text.contains("of over")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
