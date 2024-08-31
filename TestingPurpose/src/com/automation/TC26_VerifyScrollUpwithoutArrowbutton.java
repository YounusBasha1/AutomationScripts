package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC26_VerifyScrollUpwithoutArrowbutton {
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
		String expectedTitle = "Automation Exercise";
		if (driver.getTitle().contains(expectedTitle)) {
			System.out.println("Home page is visible successfully.");
		} else {
			System.out.println("Home page is not visible.");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		if (driver.findElement(By.xpath("//h2[text()='Subscription']")).getText().equals("SUBSCRIPTION")) {
			System.out.println("Sub is visible");
		} else {
			System.out.println("Not visible sub");
		}
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]"))
				.getText().equals("Full-Fledged practice website for Automation Engineers")) {
			System.out.println("Full fledge is visible");
		} else {
			System.out.println("Not visible Full fledhe");
		}
	}
}