package AssignmentSeleniumWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMultipleItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System .setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Continents=driver.findElement(By.id("continents"));
		Select Continent=new Select(Continents);
		Continent.selectByVisibleText("Antartica");
		
		try {
		WebElement seleniumcommands=driver.findElement(By.id("selenium_commands"));
		Select seleniumcommand=new Select(seleniumcommands);
		if(seleniumcommand.isMultiple()) {
			
			seleniumcommand.selectByVisibleText("Browser Commands");
			seleniumcommand.selectByVisibleText("Switch Commands");
			seleniumcommand.selectByVisibleText("Wait Commands");
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
