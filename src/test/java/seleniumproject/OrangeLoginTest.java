package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeLoginTest {

	public static void main(String args[]) throws InterruptedException {
		
		//WebDriverManager.chromedriver.setup();
		//web driver launch
		WebDriver driver = new ChromeDriver();
		//opening URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement txt =  driver.findElement(By.name("username"));
		//txt.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String actual =driver.getTitle();
		String given= "OrangeHRM";
		
		if(actual.equals(given)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		String s = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String l = "Dashboard";
		
		if(s.equals(l)) {
			
			System.out.println("Test passed1");
		}
		else {
			System.out.println("Test failed1");
		}
		
		driver.close();
		
		
		
	}
	
}
