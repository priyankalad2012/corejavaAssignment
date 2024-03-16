package AssignmentSeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowsAlertsAndPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System .setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.get("https://demo.guru99.com/test/delete_customer.php");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 
			 driver.findElement(By.name("cusid")).sendKeys("test@test.com");
			 driver.findElement(By.name("submit")).click();
			Alert alert= driver.switchTo().alert();
			alert.accept();
			Alert alert1= driver.switchTo().alert();
			alert1.accept();

	}

}
