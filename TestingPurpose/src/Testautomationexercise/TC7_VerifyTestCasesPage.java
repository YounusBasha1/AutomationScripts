package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7_VerifyTestCasesPage {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		driver.findElement(By.xpath("//li//a[contains(.,'Test Cases')]")).click();
		Thread.sleep(2000);
		if (driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases")) {
			System.out.println("navigate to testcases");
		} else {
			System.out.println("Not navigate to TC");
		}
		System.out.println("TC 7 is Completed");
		driver.close();
	}
}
