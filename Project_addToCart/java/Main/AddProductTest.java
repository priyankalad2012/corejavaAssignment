package Main;

import org.testng.annotations.Test;

import comman.Base;
import pageObject.AddProductpage;

public class AddProductTest extends Base{
	
	@Test
	public void AddProduct() {
		
		driver=connect();
	AddProductpage ap=new AddProductpage(driver);
	
	ap.MainMenuClick();
	ap.SubMenuClick();
	ap.chooseProductClick();
	ap.addTocartClick();
		
	}

}
