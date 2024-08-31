package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		WebElement slider = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Thread.sleep(1000);
		System.out.println("Location of Slider" + slider.getLocation());
		System.out.println("Size of the Slider" + slider.getSize());

		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, -28, 0).perform();
		System.out.println("slider new location" + slider.getLocation());

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-900)");
		Thread.sleep(2000);
		driver.close();

	}
}