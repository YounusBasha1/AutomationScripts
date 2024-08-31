package Testautomationexercise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC11_VerifySubscriptioninCartpage {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		String Sub = driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();
		assertEquals(Sub, "SUBSCRIPTION");

		driver.findElement(By.id("susbscribe_email")).sendKeys("younus@gmail.com");
		driver.findElement(By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]")).click();
		String success = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"))
				.getText();
		String ExpedtedSuccess = "You have been successfully subscribed!";
		if (success.equals(ExpedtedSuccess)) {
			System.out.println("Visible success");

		} else {
			System.out.println("not visible success");
		}
		System.out.println("TC11 is completed");
		driver.close();
	}

}
