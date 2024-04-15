package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.commonConnection;

public class Dat1Task {

	WebDriver driver;
	@BeforeClass
	private void setup() {

		driver=commonConnection.connect("https://www.demo.guru99.com/V4/");
	
	}
	@Test
	public void login()
	{
		//driver=commonConnection.connect("https://www.demo.guru99.com/V4/");
		
		WebElement e= driver.findElement(By.name("uid"));
		e.clear();
		e.sendKeys("mngr563779");
		WebElement p=driver.findElement(By.name("password"));
		p.clear();
		p.sendKeys("zaratad");
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
}
