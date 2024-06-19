package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//launching the browser
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
//		Alert alertwindow = driver.switchTo().alert();
//		System.out.println(alertwindow.getText());
//		alertwindow.accept();    // or in case to cancel use alertwindow.dismiss()
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Alert newalert = driver.switchTo().alert();
	}

}
