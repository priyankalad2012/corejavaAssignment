package Main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import comman.Base;
import comman.Excellreader;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class LoginTest extends Base {
	
	
	
	//@Test(dataProvider = "LoginData")
	@Test
	public void signinTest() {
		
		driver=connect();
		
		LandingPage lp= new LandingPage(driver);
		lp.signInLinkClick();
		
		
		
		
		LoginPage login =new LoginPage(driver);
		login.email("kl@test.com");
		login.password("kbL@d0910");
		login.signInBtnClick();
	}
	//@DataProvider(name="LoginData")
	public Object[][] LoginGetData() {
		
		Excellreader rd=new Excellreader("C:\\Users\\Priyanka\\OneDrive\\Desktop\\testExcel\\ProjectData.xlsx", "loginData");
		int row=rd.rowCount();
		int col=rd.colCount();
		
		Object obj[][]=new Object[row-1][col];
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				String data = rd.Getdata(i, j);
				obj[i-1][j]=data;
				
				
			}
			
		}
		return obj;
	}

}
