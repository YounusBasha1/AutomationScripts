package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	public static void main(String[] args)  throws Exception{
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://practice.automationtesting.in/");;
    driver.manage().window().maximize();
    driver.findElement(By.linkText("My Account")).click();
    	driver.findElement(By.name("username")).sendKeys("younusbasha0400@gmail.com");
    	driver.findElement(By.name("password")).sendKeys("Younus@123");
    	driver.findElement(By.name("login")).click();
    	Thread.sleep(1000);
    	System.out.println("Login Completed");
    	driver.close();
	}
}
