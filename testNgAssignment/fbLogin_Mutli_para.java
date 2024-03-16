package testNgAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.commonConnection;

public class fbLogin_Mutli_para {

	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=commonConnection.connect("https:www.fb.com");
	}
	@Test(dataProvider = "dp")
	public void login(String username, String password)
	{
		
		
		WebElement e= driver.findElement(By.id("email"));
		e.clear();
		e.sendKeys(username);
		WebElement p=driver.findElement(By.id("pass"));
		p.clear();
		p.sendKeys(password);
		
		driver.findElement(By.name("loogin")).click();
		
	}
	@DataProvider(name="dp")
	public Object[][] getdata() {
		Object obj[][] = new Object[4][2];
		
		obj[0][0]= "test123@gmail.com";
		obj[0][1]="test123";
		
		obj[1][0]= "test456@gmail.com";
		obj[1][1]="test456";
		
		obj[2][0]= "test789@gmail.com";
		obj[2][1]="test789";
		
		obj[3][0]= "test101@gmail.com";
		obj[3][1]="test101";
		
		 return obj;
	}
	
	@AfterClass
	public void finish()
	{
		//driver.quit();
	}
	
	
	
	
	
	
}
