package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	WebDriver driver=null;
	public Registrationpage(WebDriver driver) {
		super();
		this.driver=driver;
		
		PageFactory.initElements(this.driver, this);
	}

	
	
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="email_address")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//div[@class='primary']/button")
	WebElement createAccountBtn;
	
	
	public void fname(String Fname) {
		
		fname.sendKeys(Fname);
	}
	public void lname(String Lname) {
		
		lname.sendKeys(Lname);
	}
	public void email(String Email) {
	
	email.sendKeys(Email);
}
	public void pass(String Pass) {
	password.sendKeys(Pass);
}
	public void ConfirmPass(String CPass) {
	confirmPassword.sendKeys(CPass);
}
	public void CreateAccountClick() {
	createAccountBtn.click();
	
}
}
