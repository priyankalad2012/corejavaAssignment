package util;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class commonConnection {
	
		public static WebDriver connect(String url)
		{
			//System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			return driver;
		}
		
		public static void  getscreenshot(WebDriver Driver,String name, String FilePath)
		{
			TakesScreenshot ts=(TakesScreenshot) Driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(FilePath+File.separator+name);
			try {
			Files.copy(source,dest);
			System.out.println("screenshot taken....");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
	}
}
	

	