package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12_AddProducts {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/");
	String contain = driver.getTitle();
	System.out.println(contain);
	String expectedTitle = "Automation Exercise";
	if (driver.getTitle().contains(expectedTitle)) {
		System.out.println("Home page is visible successfully.");
	} else {
		System.out.println("Home page is not visible.");
	}
	driver.findElement(By.xpath("(//a[@href='/products'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-product-id='1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//u[text()='View Cart']")).click();
	Thread.sleep(2000);
	System.out.println("all products names and cost are visible");
	driver.close();
	
	
	
	
}
}
