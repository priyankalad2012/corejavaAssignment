package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.commonConnection;

public class TaskMainMethod {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Day3Task excelReader=new Day3Task();
		
		int row= excelReader.rowCount();
		System.out.println(row);
		int col=excelReader.colCount();
		System.out.println(col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data= excelReader.getdata(i,j);
				System.out.println(data);
			}
		}*/
		
		
		
		WebDriver driver = null;
		
		@BeforeClass
		public void setup()
		{
			 driver = commonConnection.connect("https://www.demo.guru99.com/V4/");
		}
		
		@Test(dataProvider = "dp")
		public void login(String emaildata, String passdata)
		{
			
			WebElement email = driver.findElement(By.name("uid"));
			WebElement pass = driver.findElement(By.name("password"));
			email.clear();
			email.sendKeys(emaildata);
			pass.clear();
			pass.sendKeys(passdata);
			
		}
		
		@DataProvider(name="dp")
		public Object[][] getData()
		{
			
			
			Day3Task rd = new Day3Task("E:\\Guru99Day3Task_parama_Login.xlsx","day3");
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
			
			driver.quit();
		}

	//}

}
