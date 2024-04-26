package comman;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;



public class Base {
	
	public static WebDriver driver=null;
	public static WebDriver connect()
	{
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Project\\src\\test\\resources\\Data.properties");
		
		Properties pro=new Properties();
		pro.load(fis);
		String browser=pro.getProperty("browser");
		String url=pro.getProperty("url");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		System.out.println(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	

}
