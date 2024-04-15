package Guru99;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import util.commonConnection;

public class Day6task {
	
	
WebDriver driver = null;

	
	@BeforeClass
	public void setup()
	{
		 driver = commonConnection.connect("https://www.demo.guru99.com/V4/");
	}
	
	static int count = 1;
	@Test(dataProvider = "dp")
	public void login(String emaildata, String passdata)
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement email = driver.findElement(By.name("uid"));
		WebElement pass = driver.findElement(By.name("password"));
		email.clear();
		email.sendKeys(emaildata);
		pass.clear();
		pass.sendKeys(passdata);
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		
		try {
			Alert alert= driver.switchTo().alert();
			 
			alert.accept();
			commonConnection.getscreenshot(driver, "success"+count+".png", "E:\\ss");
			count++;
			
			Thread.sleep(2000);
			
			
			
			 
		} catch (Exception e) {
			// TODO: handle exception
			commonConnection.getscreenshot(driver, "success"+count+".png", "E:\\ss");
		}
		
		
		
		
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		
		fileReader rd = new fileReader("E:\\Guru99Day3Task_parama_Login.xlsx","day3");
		int row = rd.rowCount();
		int col = rd.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getdata(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
		
	}
	
	@AfterClass
	public void finish()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}


}
