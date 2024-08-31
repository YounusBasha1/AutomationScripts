package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC18_ViewCategoryProducts {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		String contain = driver.getTitle();
		System.out.println(contain);
		String expectedTitle = "Automation Exercise";
		if (driver.getTitle().contains(expectedTitle)) {
			System.out.println("Home page is visible successfully.");
		} else {
			System.out.println("Home page is not visible.");
		}
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
		Thread.sleep(2000);
		WebElement Dress = driver.findElement(By.xpath("//h2[contains(text(),'Women - Dress Products')]"));
		String ActualDress = Dress.getText();
		String ExpedDress = "WOMEN - DRESS PRODUCTS";

		if (ActualDress.equals(ExpedDress)) {
			System.out.println("Dress is visible");
		} else {
			System.out.println("Not visible dress");
		}
		driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Tshirts']")).click();
		Thread.sleep(2000);
		WebElement Mens = driver.findElement(By.xpath("//h2[normalize-space()='Men - Tshirts Products']"));
		String AcMens = Mens.getText();
		String ExMens = "MEN - TSHIRTS PRODUCTS";
		if (AcMens.equals(ExMens)) {
			System.out.println("Mens visible");
		} else {
			System.out.println("Not visible mens");
		}
		System.out.println("TC 18 is completd");
		driver.close();
		
		
	}
}
