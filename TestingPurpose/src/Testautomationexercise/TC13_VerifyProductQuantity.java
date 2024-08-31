package Testautomationexercise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13_VerifyProductQuantity {
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
		driver.findElement(By.xpath("(//a[text()='View Product'])[1]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://automationexercise.com/product_details/1")) {
			System.out.println("navigated to details product");
		} else {
			System.out.println("Not navigate to product details");
		}
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		String qty = driver.findElement(By.xpath("//td[@class='cart_quantity']")).getText();
		assertEquals(qty, "4");
		System.out.println("TC 13 is completed");
		driver.close();
	}
}
