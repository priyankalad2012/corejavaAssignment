package AssignmentSeleniumWebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.commonConnection;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=commonConnection.connect("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("test@test.com");
		 driver.findElement(By.name("submit")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Alert alert1= driver.switchTo().alert();
		alert1.accept();

	}

}
