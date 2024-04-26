package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductpage {
	
	WebDriver driver=null;

	public AddProductpage(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(xpath = "//nav[@class='navigation']/ul/li[4]")
	WebElement MainMenu;
	
	@FindBy(xpath = "//nav[@class='navigation']/ul/li[4]/ul/li[1]/a/span")
	WebElement subMenu;
	
	@FindBy(xpath = "//div[@class='product-item-info']/a/span/span/img[1]")
	WebElement chooseProduct;
	
	@FindBy(id="product-addtocart-button")
	WebElement addTocart;
	
	
	public void MainMenuClick() {
		MainMenu.click();
		
	}
	public void SubMenuClick() {
		subMenu.click();
	}

	public void chooseProductClick() {
		chooseProduct.click();
	}
	
	public void addTocartClick() {
		addTocart.click();
	}
	
}
