package AssignmentSeleniumWebdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class GmailRegistration  {
	
	
	public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver=commonConnection.connect("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-368182115:1709893570079474&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=ADg0xR2YwpNvcBaFQOD2NVBOJ26Jzt8y5nsN7OV-LzVrCERukwNkJyRBL3diS-cJ");
//	 driver.findElement(By.xpath("//div[@class='JYXaTc']/div/div[2]/div/div/div/div/button/span")).click();
//	 driver.findElement(By.xpath("//div[@class='JYXaTc']/div/div/div/div/div[2]/div/ul/li[1]/span[2]")).click();
	driver.findElement(By.name("firstName")).sendKeys("Tops");
	driver.findElement(By.name("lastName")).sendKeys("Tech");
	driver.findElement(By.xpath("//div[@class='dqyqtf']/div/div/div/button/span")).click();
	
	
	 
	
	
	
	
	
	
	}
	
}
