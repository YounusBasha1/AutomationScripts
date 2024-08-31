package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC19_ViewCartBrandProducts{

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Tc 19 is completed");
		driver.close();
	 }

	@Test
	public void Testing() throws Exception {
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		Thread.sleep(2000);
		WebElement Brand = driver.findElement(By.xpath("//h2[text()='Brands']"));
		String ActualBrand = Brand.getText();
		String ExpedtedBrand = "BRANDS";
		if (ActualBrand.equals(ExpedtedBrand)) {
			System.out.println("Brands are visible");
		} else {
			System.out.println("Brands are not visible");
		}
		driver.findElement(By.xpath("//a[text()='Polo']")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://automationexercise.com/brand_products/Polo")) {
			System.out.println("navigated to Polo");

		} else {
			System.out.println("Not navigated to Polo");
		}
		driver.findElement(By.xpath("//a[text()='H&M']")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://automationexercise.com/brand_products/H&M")) {
			System.out.println("Navigated to H&M");
		} else {
			System.out.println("Not navigated to H&M");
		}
	}

}
