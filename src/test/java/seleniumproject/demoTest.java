package seleniumproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTest {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class,'allcircle circleone')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		System.out.println(ids);

       List<String> l = new ArrayList<String>(ids);
       
      String s= l.get(1);
      
      System.out.println(s);
		
      driver.switchTo().window(s);
      
      driver.findElement(By.xpath("//a[@id='dropdown10']")).click();
		
      driver.switchTo().newWindow(WindowType.TAB);
      driver.get("urbanladder.com");
	}

}
