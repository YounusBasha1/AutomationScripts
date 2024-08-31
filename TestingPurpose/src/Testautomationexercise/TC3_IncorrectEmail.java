package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class TC3_IncorrectEmail {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("home page is visible");

			driver.findElement(By.xpath("//a[contains(.,' Signup / Login')]")).click();
			WebElement Login = driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]"));
			String actuallogin = Login.getText();
			String Expedtedlogin = "Login to your account";
			if (actuallogin.equals(Expedtedlogin)) {
				System.out.println("Login in is visible");
			} else {
				System.out.println("not visible Login in ....");
			}

			driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("younus@gamil.com");
			driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("1234" + Keys.ENTER);

			WebElement error = driver.findElement(By.xpath("//p[contains(.,'Your email or password is incorrect!')]"));
			String ActualError = error.getText();
			String ExpedtedError = "Your email or password is incorrect!";
			if (ActualError.equals(ExpedtedError)) {
				System.out.println("Error message is visible");

			} else {
				System.out.println("not visible Error Message");
			}

		}
		System.out.println("TestCase 3 is completed");
		driver.close();
	}
}
