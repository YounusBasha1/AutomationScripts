package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_CorrectEmail {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		String AclHome = driver.getTitle();
		String ExpeHome = "Automation Exercise";
		if (AclHome.equals(ExpeHome)) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		driver.findElement(By.xpath("//li[contains(.,' Signup / Login')]")).click();
		System.out.println("Clicked the Sighup button");
		WebElement Login = driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]"));
		String ActualLog = Login.getText();
		String ExpedtedLog = "Login to your account";
		if (ActualLog.equals(ExpedtedLog)) {
			System.out.println("Login into visible");
		} else {
			System.out.println("Not visible Login");
		}
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("younus@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

		Thread.sleep(2000);
		WebElement Logged = driver.findElement(By.xpath("//li[contains(.,'Logged in as')]"));
		String AccLog = Logged.getText();
		String ExpedtedLog1 = "Logged in as Younus";
		if (AccLog.equals(ExpedtedLog1)) {
			System.out.println("Logged in as Younus is Visible");

		} else {
			System.out.println("not visible Logged in as");

		}
		driver.findElement(By.xpath("//a[contains(text(),' Delete Account')]")).click();
		System.out.println("Clicked the delete bitton");
		WebElement AccDel = driver.findElement(By.xpath("//b[contains(.,'Account Deleted!')]"));
		String ActuDel = AccDel.getText();
		String ExpedtedDel = "ACCOUNT DELETED!";
		if (ActuDel.equals(ExpedtedDel)) {
			System.out.println("acc is del visible");
		} else {
			System.out.println("not visible Acc del");
		}
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

		System.out.println("Test case 2 is Completed");
		driver.quit();
	}
}