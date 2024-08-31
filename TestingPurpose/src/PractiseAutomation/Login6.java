package PractiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login6 {
	public static void main(String[] args)  throws Exception{
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
		driver.navigate().to("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("username")).sendKeys("YOUNUSBASHA0400@GMAIL.COM");
		driver.findElement(By.name("password")).sendKeys("SRIHITHA@000");
		driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	    
	    WebElement error = driver.findElement(By.xpath("//li[contains(text(),'The password you entered for the username')]"));
	    WebElement error2 = driver.findElement(By.xpath("//strong[contains(text(),'YOUNUSBASHA0400@GMAIL.COM')]"));
	    
	    if (error.isDisplayed()) {{
	    	System.out.println("The password you entered for the username");
			
		}}else {
			System.out.println("Error 1 is Not Displayed");
		}
	    if (error2.isDisplayed()) {
	    	System.out.println("Error 2 is displaed");
			
		}else{
			System.out.println("not displaed");
		}
	 driver.close();   
	}
}
