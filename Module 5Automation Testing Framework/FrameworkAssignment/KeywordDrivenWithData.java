package FrameworkAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDrivenWithData {
	
	WebDriver driver = null;

	
	
	@Test(dataProvider = "dp")
	public void test(String keyword, String locator, String location, String data)
	{
		//System.out.println(function+" "+keyword+" "+locator+" "+location+" "+data);
		if(keyword.equals("browser"))
		{
			if(data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(data.equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "E:\\selenium\\chromedriver_win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(data.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "E:\\selenium\\chromedriver_win32\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		}
		else if(keyword.equals("url"))
		{
			driver.get(data);
		}
		else if(keyword.equals("type"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
			
		}
		else if(keyword.equals("click signin"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		
		}
		else if(keyword.equals("enter email"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		
		}
		else if(keyword.equals("enter password"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		
		}
		else if(keyword.equals("click login"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		
		}
		else if(keyword.equals("click logout"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		
		}
		else if(keyword.equals("close browser"))
		{
			driver.close();
		
		}
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		
		frameworkProgram1 rd = new frameworkProgram1("C:\\Users\\Priyanka\\OneDrive\\Desktop\\testExcel\\testlogindata.xlsx","hybrid");
		int row = rd.rowCount();
		int col = rd.colCount();
		System.out.println(row+" "+col);
		Object obj[][] = new Object[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i][j] = data;
			}
		}
		
		return obj;
		
	}

}
