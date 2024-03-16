package AssignmentSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.commonConnection;

public class logoFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver=commonConnection.connect("https://www.facebook.com/login/identify?ctx=recover");
		 	driver.findElement(By.xpath("//div[@role='banner']/div[2]/div/div/div[2]/a"));
		 	
		 	if(driver.getTitle().equals("Forgotten password|Can't Log In|facebook"))
		 	{
		 		System.out.println("forgote passwor page");
		 	}
		 	else
		 	{
		 		System.out.println("Other page.");
		 	}
driver.close();
	}

}
