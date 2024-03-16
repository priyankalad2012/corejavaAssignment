package AssignmentJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class GmailLogin {

	
	static WebDriver driver=null;
	@Before
	public void home()
	{
		driver=commonConnection.connect("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ATuJsjwitEYjUQrqa3-_BSW90iEtE4gHUGdINcoWtuWI9zg5ygFwFQmR9nHTgErFRuppYLvmTJg-nw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S789574015%3A1709976205498592&theme=glif");
	}
	
	
	
	@Test
	public void login()
	{
		WebElement uname=driver.findElement(By.name("identifier"));
		uname.clear();
		uname.sendKeys("priyankalad.2012");
		driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		WebElement pass=driver.findElement(By.name("Passwd"));
		pass.sendKeys("test123");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}
	@After
	public void title()
	{
		driver.close();
	}
	
	
}
