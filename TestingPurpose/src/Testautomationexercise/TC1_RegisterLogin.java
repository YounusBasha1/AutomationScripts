package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1_RegisterLogin {
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
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		System.out.println("clicked Sigh-up");
		WebElement newuser = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
		String actualuser = newuser.getText();
		String expecteduser = "New User Signup!";
		if (actualuser.equals(expecteduser)) {
			System.out.println("New user is visible");
		} else {
			System.out.println("not visible New User");
		}
		driver.findElement(By.name("name")).sendKeys("Younus0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("younusbashalll@gamil.com");
		driver.findElement(By.xpath("//button[@type='submit'][@data-qa='signup-button']")).click();
		Thread.sleep(1000);
		WebElement EnterAccount = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
		String actualAcc = EnterAccount.getText();
		String ExpectedAcc = "ENTER ACCOUNT INFORMATION";
		if (actualAcc.equals(ExpectedAcc)) {
			System.out.println("acc is visible");
		} else {
			System.out.println("not Visible enter acc");
		}

		driver.findElement(By.name("title")).click();
		driver.findElement(By.id("password")).sendKeys("unus");

		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("4");
		System.out.println("Selected 4 in days");

		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByIndex(9);
		System.out.println("Selected Sep in Month");
		Thread.sleep(1000);

		Select Year = new Select(driver.findElement(By.id("years")));
		Year.selectByIndex(22);
		System.out.println("Selected 2000 in year");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='checkbox'][@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][@name='optin']")).click();
		System.out.println("clicked the checkboxes");

		driver.findElement(By.name("first_name")).sendKeys("Shaik");
		driver.findElement(By.name("last_name")).sendKeys("Younus");
		driver.findElement(By.name("company")).sendKeys("Cignity");
		driver.findElement(By.name("address1")).sendKeys("Yadahava");
		driver.findElement(By.name("address2")).sendKeys("RNPET");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("India");
		System.out.println("Selected Inda");

		driver.findElement(By.name("state")).sendKeys("AP");
		driver.findElement(By.name("city")).sendKeys("Nellore");
		driver.findElement(By.name("zipcode")).sendKeys("524001");
		driver.findElement(By.id("mobile_number")).sendKeys("123456789");

		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

		Thread.sleep(2000);

		WebElement AccountCreate = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]"));
		String actualCreate = AccountCreate.getText();
		String ExpedtedCreate = "ACCOUNT CREATED!";
		if (actualCreate.equals(ExpedtedCreate)) {
			System.out.println("Acc is created");
		} else {
			System.out.println("Not created acc");

		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		System.out.println("clicked the Continue button");
		Thread.sleep(2000);

		WebElement Logged = driver.findElement(By.xpath("//li[contains(., 'Logged in as')]/a"));
		System.out.println(Logged.getText());
		String actualLog = Logged.getText();
		String ExpedtedLog = "Logged in as Younus";
		if (actualLog.equals(ExpedtedLog)) {
			System.out.println("Logged in visible");
		} else {
			System.out.println("not visible Logged in as....");
		}
		WebElement Younu = driver.findElement(By.xpath("//b[normalize-space()='Younus']"));
		String actualname = Younu.getText();
		String Expedtedname = "Younus";
		if (actualname.equals(Expedtedname)) {
			System.out.println("Younus is visible");

		} else {
			System.out.println("not visible younus");
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
		System.out.println("Test case 1 is completed");
		driver.close();
	}
}
