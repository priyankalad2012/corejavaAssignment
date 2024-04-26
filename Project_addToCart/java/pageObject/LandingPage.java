package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver=null;
	public LandingPage(WebDriver driver) {
		super();
		this.driver=driver;
		
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath ="//div[@class='panel header']/ul/li[3]/a")
	WebElement createAccountLink;
	
	public void createAccountLinkClick() {
		createAccountLink.click();
	}
	
	@FindBy(xpath ="//div[@class='panel header']/ul/li[2]/a")
	WebElement signInLink;
	
	public void signInLinkClick() {
		
		signInLink.click();
		
	}

}
