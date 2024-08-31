package Testautomationexercise;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9_SearchProduct {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		driver.findElement(By.xpath("//a[contains(text(),' Products')]")).click();
		Thread.sleep(3000);
		if (driver.getTitle().equals("Automation Exercise - All Products")) {
			System.out.println("Page Navigate to All products");
		} else {
			System.out.println("Not navigate to Products");
		}
		driver.findElement(By.name("search")).sendKeys("Jeans" + Keys.TAB + Keys.ENTER);
		WebElement Search = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
		String ActualSearch = Search.getText();
		String Expedtedsearch = "SEARCHED PRODUCTS";
		if (ActualSearch.equals(Expedtedsearch)) {
			System.out.println("Search is visible");
		} else {
			System.out.println("Not visible Search");
		}

		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'productinfo')]"));
		for (int i = 0; i < items.size(); i++) {
			assertTrue(items.get(i).getText().contains("Jeans"));
		}
		System.out.println("TC_9 is completed");
		driver.close();
	}

}