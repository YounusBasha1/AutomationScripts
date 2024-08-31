package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_RegisterUserwithexistingemail {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");

		} else {
			System.out.println("Not visible home page");
		}
		driver.findElement(By.xpath("//li[contains(.,' Signup / Login')]")).click();
		WebElement New = driver.findElement(By.xpath("//h2[contains(.,'New User Signup!')]"));
		String ActualNew = New.getText();
		String ExpedtedNew = "New User Signup!";
		if (ActualNew.equals(ExpedtedNew)) {
			System.out.println("New user is visible");
		} else {
			System.out.println("not visibile New User");
		}

		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Younus");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("younus@gmail.com" + Keys.ENTER);
		Thread.sleep(1000);
		WebElement Error = driver.findElement(By.xpath("//p[contains(text(),'Email Address already exist!')]"));
		String ActualError = Error.getText();
		String ExpedtedError = "Email Address already exist!";
		if (ActualError.equals(ExpedtedError)) {
			System.out.println("Error msg is displayed");
		} else {
			System.out.println("Not displayed Error");
		}
		System.out.println("Test case 5 is Completed");
		driver.close();
	}
}
