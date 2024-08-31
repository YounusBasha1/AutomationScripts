package Testautomationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_ContactUsForm {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
		WebElement Get = driver.findElement(By.xpath("//h2[contains(text(),'Get In Touch')]"));
		String ActualGet = Get.getText();
		String ExpedGet = "GET IN TOUCH";
		if (ActualGet.equals(ExpedGet)) {
			System.out.println("Get in Is displayed");
		} else {
			System.out.println("Not Displayed get in ...");
		}
		driver.findElement(By.name("name")).sendKeys("Younus");
		driver.findElement(By.name("email")).sendKeys("younus@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("Maths");
		driver.findElement(By.name("message")).sendKeys("Practise Automation");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\HP\\Downloads\\Doc1Empty.docx");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();

		driver.switchTo().alert().accept();
		System.out.println("accepted");
		jse.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(1000);
		WebElement Success = driver
				.findElement(By.xpath("//div[@style='display: block;'][@class='status alert alert-success']"));
		String ActualSuccess = Success.getText();
		String ExpedtedSuccess = "Success! Your details have been submitted successfully.";
		if (ActualSuccess.equals(ExpedtedSuccess)) {
			System.out.println("Success message is displayed");
		} else {
			System.out.println("Not displayed Succes");

		}
		driver.findElement(By.xpath("//span[contains(.,'Home')]")).click();
		Thread.sleep(3000);

		if (driver.getTitle().equals("Automation Exercise")) {
			System.out.println("Home page is visible");
		} else {
			System.out.println("Not visible Home");
		}
		System.out.println("Test case 6 is completed");
		driver.close();

	}
}