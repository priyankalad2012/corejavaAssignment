package Main;

import org.testng.annotations.Test;
import com.google.common.annotations.VisibleForTesting;

import comman.Base;
import comman.Excellreader;
import pageObject.LandingPage;
import pageObject.Registrationpage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends Base{
	
	
	@Test(dataProvider = "Reg_data")
	public void RegTest(String fname, String lname, String email, String password, String ConfirmPassword)
	
	{
		driver=connect();
		LandingPage lp = new LandingPage(driver);
		lp.createAccountLinkClick();
		
		Registrationpage reg=new Registrationpage(driver);
		reg.fname(fname);
		reg.lname(lname);
		reg.email(email);
		reg.pass(password);
		reg.ConfirmPass(ConfirmPassword);
		reg.CreateAccountClick();
		
	}
	
	@DataProvider(name="Reg_data")
	public Object[][] regGetdata(){
		
		Excellreader rd= new Excellreader("C:\\Users\\Priyanka\\OneDrive\\Desktop\\testExcel\\ProjectData.xlsx", "RegData");
		
		int row=rd.rowCount();
		int col=rd.colCount();
		
		Object obj[][]=new Object[row-1][col];
		for(int i=1;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				String data=rd.Getdata(i, j);
				obj[i-1][j]=data;
			}
		}
		return obj;
	}
}
