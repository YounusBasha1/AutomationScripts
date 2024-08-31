package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("reg_email")).sendKeys("chavuturu@gmail.com");
//		driver.findElement(By.id("reg_password")).sendKeys("Younus@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(3000);
		WebElement errormessage = driver
				.findElement(By.xpath("//li[contains(text(),' Please enter an account password.')]"));

		if (errormessage.isDisplayed()

		) {
			System.out.println("displayed");

		} else {
			System.out.println("Not displayedl");
		}
		driver.close();
	}

}
