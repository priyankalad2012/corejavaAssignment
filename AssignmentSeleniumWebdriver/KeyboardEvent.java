package AssignmentSeleniumWebdriver;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.commonConnection;

public class KeyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=commonConnection.connect("https://www.facebook.com/login");
		
		WebElement username= driver.findElement(By.name("email"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(username)
				.click()
				.sendKeys(username,"hello")
				.keyUp(username, Keys.SHIFT)
				.doubleClick(username)
				.contextClick()
				.build()
				.perform();
		
		
		
	}

}
