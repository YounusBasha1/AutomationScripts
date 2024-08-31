package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop10 {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		System.out.println("done");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		System.out.println("scroll done");

		driver.findElement(By.xpath(
				"//li[@class='post-169 product type-product status-publish product_cat-android product_tag-android has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock sale downloadable taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"))
				.click();
		System.out.println("clicked the item");
		Thread.sleep(3000);

		WebElement item = driver.findElement(By.xpath("//span[@class='amount']"));
		System.out.println(item);
		String messageText = item.getText();
		String Expected = "1 item";
		

		if (messageText.equals(Expected)) {
			System.out.println("Success message is displayed");

		} else {
			System.out.println("Success message is not displayed");

		}
		driver.close();

	}
}
