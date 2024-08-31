package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC22_AddtocartfromRecommendeditems {
	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");

	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("TC 22 is completed");
		driver.quit();
	}

	@Test
	public void Testing() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//h2[text()='recommended items']")).getText().equals("RECOMMENDED ITEMS")) {
			System.out.println("Rec is visible");

		} else {
			System.out.println("not visible Rec");
		}
		Thread.sleep(2000);

		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='recommended items']")).getText(),
				"RECOMMENDED ITEMS", "Not visible");
		driver.findElement(By.xpath("(//a[text()='Add to cart'])[72]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Stylish Dress']")).getText(),"Stylish Dress","not visible Stylish Dress");
	}

}
