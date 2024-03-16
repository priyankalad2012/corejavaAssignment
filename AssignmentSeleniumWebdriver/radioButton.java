package AssignmentSeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=commonConnection.connect("https://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2= driver.findElement(By.id("vfb-7-2"));
		WebElement radio3=driver.findElement(By.id("vfb-7-3"));
		radio1.click();
		Thread.sleep(2000);
		radio2.click();
		Thread.sleep(2000);
		radio3.click();
	}

}
