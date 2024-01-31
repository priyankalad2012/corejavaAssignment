package AssignmentCoreJava;

class insufficeintBalanceException extends Exception
{
	
}

class bank
{
	double balance;
	public void getBalance()
	{
		System.out.println("total balance is : "+ balance);
	}
	public void deposite(double amount)
	{
		balance=balance + amount;
	}
	public void widraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Sorry, insufficient balance, you need more 500 Rs.");
		}
		else
		{
			balance=balance-amount;
		}
		
		
	}
}




public class customeExcepetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank b=new bank();
		b.getBalance();
		b.deposite(2000);
		b.getBalance();
		b.widraw(2500);
		b.getBalance();
		
		

	}

}
