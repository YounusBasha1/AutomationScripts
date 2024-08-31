package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shop4 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);

		Select st = new Select(driver.findElement(By.className("orderby")));
//	st.selectByVisibleText("Sort by average rating");
		st.selectByIndex(2);
		jse.executeScript("window.scrollBy(0,500)");
		System.out.println("done");
		Thread.sleep(1000);
		driver.close();

	}
}
