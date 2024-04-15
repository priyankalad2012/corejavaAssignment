package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		
		List<WebElement> Edit= driver.findElements(By.xpath("//div[@class='action-buttons']/span[1]/svg"));
		//List <WebElement> name=driver.findElements(By.xpath("//div[@class='rt-tr -']/div[1]"));
String name = "Cierradsds";
		
		try {
			WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			if(element.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
			}
			else
			{
				System.out.println("Not visible");
			}
		
		} catch (Exception e) {
			System.out.println("name not found");
		}
		
		
		
		
		
		
		
	}

}
