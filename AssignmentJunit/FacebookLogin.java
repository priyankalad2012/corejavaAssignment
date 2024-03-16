package AssignmentJunit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class FacebookLogin {
	
	
	static WebDriver driver=null;
	
	@BeforeClass
	public static void setup()
	{
		driver=commonConnection.connect("https://www.fb.com");
	}
	
	@Test
	public void login()
	{
		WebElement uname=driver.findElement(By.id("email"));
		uname.clear();
		uname.sendKeys("Test");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("test123");
		
		driver.findElement(By.name("login")).click();
	}
	
	
	

}
