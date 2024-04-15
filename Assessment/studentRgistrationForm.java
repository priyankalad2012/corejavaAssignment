package practiesForm;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class studentRgistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System .setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String Myday="25";
		
		String Mymonth="December";
		String MyYear="2024";
		
		
		WebElement fName=driver.findElement(By.id("firstName"));
		fName.sendKeys("Priyanka");
		WebElement lName=driver.findElement(By.id("lastName"));
		lName.sendKeys("Lad");
		WebElement UserEmail=driver.findElement(By.id("userEmail"));
		UserEmail.sendKeys("Priyanka@gmail.com");
		try {
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		driver.findElement(By.xpath("//div[@id='userNumber-wrapper']/div[2]/input")).sendKeys("7894561230");
try {
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		Select months=new Select(month);
		months.selectByVisibleText(Mymonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years=new Select(year);
		years.selectByVisibleText(MyYear);
		
		List<WebElement> days=driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		for(WebElement day: days)
		{
			if(day.getText().equals(Myday))
			{
				if(day.getAttribute("aria-label").contains(Mymonth))
				{
					day.click();
					break;
				}
			}
				
		}
	}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
		
		WebElement subject=driver.findElement(By.id("subjectsContainer"));
		
		Actions builder= new Actions(driver);
		builder.click()
				.sendKeys("MAths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
		
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("E:\\git_CMD.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Surat,gujarat");
		
		WebElement state=driver.findElement(By.className(" css-1wa3eu0-placeholder"));
		Select stats = new Select(state);
		stats.selectByVisibleText("NCR");
		
		WebElement city=driver.findElement(By.className(" css-1wa3eu0-placeholder"));
		Select cities = new Select(city);
		cities.selectByVisibleText("Agra");
		driver.findElement(By.id("submit").click();

	}

}
