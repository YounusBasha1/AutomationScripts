package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17_RemProFroCart {
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
		driver.findElement(By.xpath("(//a[contains(text(),'Add')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[starts-with(@data-product-id,'2')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'View Cart')]")).click();
		Thread.sleep(1000);
		if (driver.getCurrentUrl().equals("https://automationexercise.com/view_cart")) {
			System.out.println("Cart page is displayed");
		} else {
			System.out.println("Not visible Cart page");
		}
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//b[text()='Cart is empty!']")).isDisplayed()) {
			System.out.println("cart is empty");
		} else {
			System.out.println("not visi Cart is Ept");
		}
		System.out.println("TC 17 is completed");
		driver.close();
	}
}
