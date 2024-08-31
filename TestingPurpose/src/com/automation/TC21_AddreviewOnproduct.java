package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC21_AddreviewOnproduct {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("TC 21 is completed");
		driver.quit();
	}

	@Test
	public void Testing() throws Exception {
		driver.findElement(By.xpath("//a[contains(@href,'/products')]")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//h2[text()='All Products']")).getText().equals("ALL PRODUCTS")) {
			System.out.println("All Products Visible");
		} else {
			System.out.println("not visible All Products");
		}
		driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		if (driver.findElement(By.xpath("//a[contains(text(),'Write Your Review')]")).getText()
				.equals("WRITE YOUR REVIEW")) {
			System.out.println("WYR is Visible");
		} else {
			System.out.println("not visible WYR");
		}
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("younus");
		driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]")).sendKeys("younus00@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder]")).sendKeys("Best site");
		driver.findElement(By.id("button-review")).click();
		if (driver.findElement(By.xpath("//span[text()='Thank you for your review.']")).getText()
				.equals("Thank you for your review.")) {
			System.out.println("visible Thank");

		} else {
			System.out.println("Not visible Thank");
		}

	}
}
