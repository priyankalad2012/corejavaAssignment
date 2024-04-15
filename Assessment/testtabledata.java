package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class testtabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
				WebDriver driver = commonConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
				

				
				
				List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
				
				List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
				for(WebElement h : head)
				{
					System.out.print(h.getText()+" ");
				}
				System.out.println();
				for(int i=2;i<=row.size();i++)
				{
					List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
					for(WebElement c  :cols)
					{
						System.out.print(c.getText()+" ");
					}
					System.out.println();
				}
			
			}

}
