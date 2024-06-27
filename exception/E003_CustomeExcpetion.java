package exception;

import java.util.Scanner;

class InSufficeintAmountExeption extends Exception
{
	
}

class Bank
{
	double balance;
	
	
	
	
	public void getBalance()
	{
		
		Scanner sc = new Scanner(System.in);
		balance = sc.nextDouble();
		System.out.println("Current balance is : "+balance);
	}
	
	public void deposit(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdraw(double amt) throws InSufficeintAmountExeption
	{
		if(amt>balance)
		{
			//System.out.println("insufficient balance");
			throw new InSufficeintAmountExeption();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class E003_CustomeExcpetion {
	public static void main(String[] args) {
		
		
		
		Bank b = new Bank();
		b.getBalance();
		b.deposit(5000);
		b.deposit(4000);
		b.getBalance();
		
		try {
			b.withdraw(10000);
		} catch (InSufficeintAmountExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.getBalance();
	}
}
