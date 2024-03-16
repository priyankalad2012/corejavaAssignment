package testNgAssignment;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "Smoke")
	public void savingAccount() {
		System.out.println("Saving account running");
		
	}
	@Test
	public void currentaccount() {
		System.out.println("Current Acoount running");
	}
	@Test
	public void loanAccount() {
		System.out.println("loan Account running");
	}
	
	
	
	
	
	
	

}
