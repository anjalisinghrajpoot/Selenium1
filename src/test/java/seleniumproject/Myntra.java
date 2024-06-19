package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("nike shoes");
		Thread.sleep(3000);
		driver.findElement(By.className("_2iLD__")).click();
		//driver.findElement(By.("_2iLD__")).click();
		
		//System.out.println(text);
	}
	
}
