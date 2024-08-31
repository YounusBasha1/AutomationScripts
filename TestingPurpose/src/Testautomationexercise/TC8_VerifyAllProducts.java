package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8_VerifyAllProducts {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		driver.findElement(By.xpath("//a[contains(.,'Products')]")).click();
		Thread.sleep(3000);
		if (driver.getTitle().equals("Automation Exercise - All Products")) {
			System.out.println("Navigated to All Pro..");
		} else {
			System.out.println("not Navigate to all pro...");
		}
		driver.findElement(By.xpath("(//a[contains(.,'View Product')])[1]")).click();
		Thread.sleep(1000);
		if (driver.getCurrentUrl().equals("https://automationexercise.com/product_details/1")) {
			System.out.println("navigated to product page");

		} else {
			System.out.println("Not navigated to page");
		}
		WebElement ProductName  = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		WebElement CategoryName = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
		WebElement Cost         = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
		WebElement Avaliablity  = driver.findElement(By.xpath("//b[text()='Availability:']"));
		WebElement Condition    = driver.findElement(By.xpath("//b[contains(.,'Condition:')]"));
		WebElement Brand        = driver.findElement(By.xpath("//b[contains(.,'Brand:')]"));
		if (ProductName.isDisplayed() && CategoryName.isDisplayed() && Cost.isDisplayed() && Avaliablity.isDisplayed()
				&& Condition.isDisplayed() && Brand.isDisplayed()) {
			System.out.println("Product Details are visible");
		} else {
			System.out.println("Not visible");
		}
		System.out.println("TC8 is completed");
		driver.close();
	}
}