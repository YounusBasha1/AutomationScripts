package Testautomationexercise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10_VerifySubscriptionInhomepage {
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

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,7950)");
		driver.findElement(By.id("susbscribe_email")).sendKeys("younus@gmail.com");
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
		String Success = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"))
				.getText();
		assertEquals(Success, "You have been successfully subscribed!");
		System.out.println("TC10 is completed");
		driver.close();

	}
}
