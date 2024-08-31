package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC16_PO_LogBefcheOT {
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
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Younus");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']"))
				.sendKeys("younusbaj@gmail.com" + Keys.TAB + Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("first_name")).sendKeys("Shaik");
		driver.findElement(By.id("last_name")).sendKeys("Younus");
		driver.findElement(By.id("address1")).sendKeys("Nellore");
		driver.findElement(By.id("state")).sendKeys("AP");
		Thread.sleep(1000);
		Select st = new Select(driver.findElement(By.id("country")));
		st.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("nellore");
		driver.findElement(By.id("zipcode")).sendKeys("12345567890");
		driver.findElement(By.id("mobile_number")).sendKeys("0987654321");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		Thread.sleep(2000);
		String Actualtext = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
		String Expedtedtext = "ACCOUNT CREATED!";
		if (Actualtext.equals(Expedtedtext)) {
			System.out.println("Acc is visi");
		} else {
			System.out.println("not visi Acc");
		}
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Thread.sleep(3000);
		boolean user = driver.findElement(By.xpath("//a[text()=' Logged in as ']/b[contains(text(),'Younus')]"))
				.isDisplayed();
		if (user) {
			System.out.println("Visible Login as");
		} else {
			System.out.println("Not visible Login as");
		}
		driver.findElement(By.xpath("(//a[contains(text(),'Add')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[starts-with(@data-product-id,'2')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'View Cart')]")).click();
		Thread.sleep(1000);
		if (driver.getCurrentUrl().equals("https://automationexercise.com/view_cart")) {
			System.out.println("Cart page is displayed");
		} else {
			System.out.println("Not visible Cart page");
		}
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		driver.findElement(By.name("name_on_card")).sendKeys("Younus");
		driver.findElement(By.name("card_number")).sendKeys("1234567");
		driver.findElement(By.name("cvc")).sendKeys("123");
		driver.findElement(By.name("expiry_month")).sendKeys("12");
		driver.findElement(By.name("expiry_year")).sendKeys("2024");
		driver.findElement(By.xpath("//button[@class='form-control btn btn-primary submit-button']")).click();
		Thread.sleep(1000);
		WebElement Success = driver
				.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!']"));
		String ActualSuccess = Success.getText();
		String ExpedtedSuccess = "Congratulations! Your order has been confirmed!";
		if (ActualSuccess.equals(ExpedtedSuccess)) {
			System.out.println("Visible Success");
		} else {
			System.out.println("Not visi succ");
		}
		driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		Thread.sleep(1000);
		WebElement Del = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		String AccDel = Del.getText();
		String Expdel = "ACCOUNT DELETED!";
		if (AccDel.equals(Expdel)) {
			System.out.println("Acc is Del");

		} else {
			System.out.println("not del acc");
		}
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		System.out.println("TC is 16 is completed");
		driver.close();
	}
}
