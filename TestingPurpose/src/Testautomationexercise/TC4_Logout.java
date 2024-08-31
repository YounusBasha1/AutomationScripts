package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_Logout {
	public static void main(String[] args) throws Exception {
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

			driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("younus@gmail.com");
			driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345" + Keys.ENTER);
			System.out.println("Succesfully Login");
			Thread.sleep(1000);
			WebElement Logged = driver.findElement(By.xpath("//a[contains(.,'Logged in as')]"));
			String ActualLogged = Logged.getText();
			String ExpedtedLogged = "Logged in as Younus";
			if (ActualLogged.endsWith(ExpedtedLogged)) {
				System.out.println("Logged in as Visible");
			} else {
				System.out.println("Not visible Logged in as..");
			}
			driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
			if (driver.getTitle().equals("Automation Exercise - Signup / Login")) {
				System.out.println("it is navigate to login page");
			} else {
				System.out.println("not navigate to Login page");
			}
			System.out.println("Test case 4 is Completed");
			driver.close();
		}
	}
}
