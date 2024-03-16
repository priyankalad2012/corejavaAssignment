package AssignmentSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.commonConnection;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= commonConnection.connect("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement contries= driver.findElement(By.name("country"));
		Select contry =new Select(contries);
		contry.selectByVisibleText("INDIA");
	}

}
