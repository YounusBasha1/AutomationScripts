package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop9 {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Android Quick Start Guide']")).click();
		System.out.println("Clicked on image");

		WebElement money = driver.findElement(By.xpath("//del//span[@class='woocommerce-Price-amount amount']"));
		WebElement Smoney = driver.findElement(By.xpath("//ins//span[@class='woocommerce-Price-amount amount']"));

		if (money.isDisplayed()) {
			System.out.println("first is diaplayed");
			if (Smoney.isDisplayed()) {
				System.out.println("displayed");

			} else {
				System.out.println("Not displayed");
			}

		}
	}
}
