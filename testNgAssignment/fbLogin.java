package testNgAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.commonConnection;

public class fbLogin {

	
	WebDriver driver;
	@BeforeClass
	private void setup() {

		driver=commonConnection.connect("https:www.fb.com");
	
	}
	@Test
	public void login()
	{
		
		
		WebElement e= driver.findElement(By.id("email"));
		e.clear();
		e.sendKeys("test@fb.com");
		WebElement p=driver.findElement(By.id("pass"));
		p.clear();
		p.sendKeys("test123");
		
		driver.findElement(By.name("loogin")).click();
		
	}
	
	
	@AfterClass
	public void finish()
	{
		//driver.quit();
	}
	
	
	
	
}
