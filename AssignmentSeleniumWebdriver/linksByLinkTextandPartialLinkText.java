package AssignmentSeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksByLinkTextandPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.techbeamers.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.linkText("Contact")).click();
		
		WebElement linkText = driver.findElement(By.linkText("Contact"));
		
		
		js.executeScript("arguments[0].scrollInHide();", linkText);
		linkText.click();
		//WebElement partialLinkText= driver.findElement(By.partialLinkText("POM"));
		//js.executeScript("arguments[0].scrollIntoView();", partialLinkText);
		//partialLinkText.click();
				

	}

}
