package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop11 {
	public static void main(String[] args) throws Exception {

		WebDriver  driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//a[@rel='nofollow'][@data-quantity='1'][@data-product_id='169']")).click();
		System.out.println("clicked Add to basket");
		Thread.sleep(3000);
		WebElement basket = driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward'][@title='View Basket']"));
		String actualbasket = basket.getText();
		String Expectedbasket = "View Basket";
		if (actualbasket.equals(Expectedbasket)) {
			System.out.println("View basket is displayed");
			
		}else {
			System.out.println("Not displayed View Basket");
		}
		/*
		 * // driver.findElement(By.xpath( //
		 * "//li[@class='post-169 product type-product status-publish product_cat-android product_tag-android has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock sale downloadable taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"
		 * )) // .click();
		 */		System.out.println("Clicked");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title=\"View your shopping cart\"]")).click();
		System.out.println("clicked the item");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		System.out.println("clicked Process to checkout");
		driver.findElement(By.id("billing_first_name")).sendKeys("shaik");
		System.out.println("1st anme");
		driver.findElement(By.id("billing_last_name")).sendKeys("Younus");
		driver.findElement(By.id("billing_company")).sendKeys("Cignity");
		driver.findElement(By.id("billing_email")).sendKeys("younus@gmail.com");
		driver.findElement(By.xpath(
				"//p[@class='form-row form-row form-row-last validate-required validate-phone']//input[@type='tel']"))
				.sendKeys("123456789");
		System.out.println("numbver");

		driver.findElement(By.className("select2-chosen")).click();
		driver.findElement(By.id("select2-result-label-105")).click();
		System.out.println("select India");
		driver.findElement(By.name("billing_address_1")).sendKeys("iagfe");
		driver.findElement(By.name("billing_city")).sendKeys("Nellore");

		driver.findElement(By.name("billing_postcode")).sendKeys("524001");

		WebElement check = driver.findElement(By.id("createaccount"));

		if (check.isSelected()) {
			System.out.println("checkbox is selected");
		} else {
			System.out.println("checkbox is not selected");
		}
		driver.findElement(By.id("createaccount")).click();
		System.out.println("Selected Checkbox");
		Thread.sleep(2000);
		driver.findElement(By.id("createaccount")).click();
		System.out.println("DeSelected Checkbox");
		Thread.sleep(1000);

		WebElement direct = driver.findElement(By.id("payment_method_bacs"));
		WebElement checkpay = driver.findElement(By.id("payment_method_cheque"));
		WebElement cash = driver.findElement(By.id("payment_method_cod"));
		WebElement Paypal = driver.findElement(By.id("payment_method_ppec_paypal"));
		Paypal.click();
		if (direct.isSelected()) {
			System.out.println("direct is selected");

		} else {
			System.out.println(" direct is Not selectecd");
		}
		if (checkpay.isSelected()) {
			System.out.println("check is selected");

		} else {
			System.out.println("check is Not selected");
		}
		if (cash.isSelected()) {
			System.out.println("cash is selected");

		} else {
			System.out.println("cash is Not selected");
		}
		if (Paypal.isSelected()) {
			System.out.println("paypal is selected");

		} else {
			System.out.println("pay pal is Not selected");
		}
		direct.click();
		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath(
				"//p[contains(text(),'Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order won’t be shipped until the funds have cleared in our account.')]"));
		String actualText = text.getText();
		String ExpectedText = "Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order won’t be shipped until the funds have cleared in our account.";
		if (actualText.equals(ExpectedText)) {
			System.out.println("Expected direct Text");

		} else {
			System.out.println("Not Expeted TExt");
		}
		checkpay.click();
		Thread.sleep(1000);
		WebElement CheckText = driver.findElement(By.xpath(
				"//p[contains(text(),'Please send a cheque to Store Name, Store Street, Store Town, Store State / County, Store Postcode.')]"));
		String actualcheck = CheckText.getText();
		String ExpectedCheck = "Please send a cheque to Store Name, Store Street, Store Town, Store State / County, Store Postcode.";
		if (actualcheck.equals(ExpectedCheck)) {
			System.out.println("Expected Check Text");

		} else {
			System.out.println("not Expected Check text");
		}
		cash.click();
		Thread.sleep(1000);
		WebElement cashText = driver.findElement(By.xpath("//p[contains(text(),'Pay with cash upon delivery.')]"));
		String actualcash = cashText.getText();
		String expectedcash = "Pay with cash upon delivery.";
		if (actualcash.equals(expectedcash)) {
			System.out.println("Expected cash Text");

		} else {
			System.out.println("not expedted cash text");

		}
		Paypal.click();
		Thread.sleep(1000);
		WebElement paypalcash = driver.findElement(By.xpath(
				"//p[contains(text(),'Pay using either your PayPal account or credit card. All credit card payments will be processed by PayPal.')]"));
		String actualpaypal = paypalcash.getText();
		String expectedpaypal = "Pay using either your PayPal account or credit card. All credit card payments will be processed by PayPal.";
		if (actualpaypal.equals(expectedpaypal)) {
			System.out.println("Expected paypal text");

		} else {
			System.out.println("not Expected paypal");
		}
		cash.click();
		Thread.sleep(1000);
		driver.findElement(By.name("woocommerce_checkout_place_order")).click();
		System.out.println("clicked order");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Success Test");

	}
}