package testNgAssignment;

import org.testng.annotations.Test;

public class Grouping2 {
	
	@Test(groups = "Smoke")
	public void debitCard() {
		System.out.println("Debit card payment");
	}
	@Test
	public void creditCard() {
		System.out.println("Credit card payment");
	}
	@Test
	public void COD() {
		System.out.println("Cash On delivery");
	}

}
