package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login4 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("password")).sendKeys("Srihitha@000");
		System.out.println("password is entered");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		WebElement error = driver
				.findElement(By.xpath("//li[contains(text(),' Username is required.')]"));

		if (error.isDisplayed()) {
			System.out.println("displayed");
		} else {
			System.out.println("Not Displayed");
		}
		driver.close();
	}
}
