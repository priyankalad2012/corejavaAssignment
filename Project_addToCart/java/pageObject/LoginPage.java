package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	WebDriver driver=null;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
	}
	

	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='primary']/button")
	WebElement signInBtn;
	
	
	
	
	public void email(String emailId) {
		
		email.sendKeys(emailId);
		
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
	public void signInBtnClick() {
		signInBtn.click();
	}
}
