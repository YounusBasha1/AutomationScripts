package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oghrms {
 public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jav.guru/");
	Thread.sleep(2000);
	driver.findElement(By.id("searchm")).sendKeys("leela fucks blur");
//	Thread.sleep(x3000);
	driver.findElement(By.xpath("//button[@class='search-submit']")).click();
	
}
}
