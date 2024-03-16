package AssignmentSeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.commonConnection;

public class AllHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=commonConnection.connect("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement>Links= driver.findElements(By.tagName("a"));
		System.out.println(Links);
		for (WebElement allLinks : Links) {
			System.out.println(allLinks.getText()+"-"+allLinks.getAttribute("href"));
			driver.close();
		}

	}

}
