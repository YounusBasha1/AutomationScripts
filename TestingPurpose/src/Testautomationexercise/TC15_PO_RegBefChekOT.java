package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC15_PO_RegBefChekOT {
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
		boolean user = driver.findElement(By.xpath("//a[text()=' Logged in as ']/b[contains(text(),'Younus')]")).isDisplayed();
		if (user) {
			System.out.println("Visible Login as");
		} else {
			System.out.println("Not visible Login as");
		}
		driver.findElement(By.xpath("//a[contains(text(),' Delete Account')]")).click();

		WebElement AccDel = driver.findElement(By.xpath("//b[contains(text(),'Account Deleted!')]"));
		String actualDel = AccDel.getText();
		String ExpedtedDel = "ACCOUNT DELETED!";
		if (actualDel.equals(ExpedtedDel)) {
			System.out.println("Acc del is visible");

		} else {
			System.out.println("not visible acc del");

		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		System.out.println("clicked Continue Button");
		System.out.println("Test case 15 is completed");
		driver.close();

	}
}
