package AssignmentSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.commonConnection;

public class MouseHoverEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=commonConnection.connect("https://demo.guru99.com/test/newtours/");
		
		WebElement From= driver.findElement(By.xpath("//tr[@class='mouseOut']/td"));
		WebElement Home= driver.findElement(By.linkText("Home"));
		Actions builder=new Actions(driver);
		
		builder.moveToElement(Home).build();
		
		String ChangeColor=From.getCssValue("background-color");
		System.out.println("before Hover : "+ChangeColor);
		builder.perform();
		ChangeColor=From.getCssValue("background-color");
		System.out.println("before Hover : "+ChangeColor);
		
		driver.close();
		
		
		
		

	}

}
