package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("HTML")).click();
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,120)");
		Thread.sleep(2000);

		WebElement Image = driver.findElement(By.xpath("//img[@title='Mastering HTML5 Forms']"));

		if (Image.isDisplayed()) {
			System.out.println("Displayed");

		} else {
			System.out.println("Not DIsplayed");

		}
		driver.close();
	}
}
