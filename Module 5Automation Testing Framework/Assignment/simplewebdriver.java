package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.commonConnection;

public class simplewebdriver {
	
	
	WebDriver driver;

	@BeforeClass
	private void setup() {

		driver=commonConnection.connect("https://www.fb.com");
	
	}
	@Test
	public void login()
	{
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		email.clear();
		email.sendKeys("test@test.com");
		pass.clear();
		pass.sendKeys("test123");
		driver.findElement(By.name("login")).click();
		
	}

}
