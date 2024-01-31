package AssignmentCoreJava;

import java.util.Scanner;

public class fectorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number to calculate factorial : ");
		int factorialNumber = sc.nextInt();
		int fact =1;
		for(int i=1;i<=factorialNumber;i++)
		{
			//fact= fact-1;
			fact=fact*i;
			
			
		}
		
		System.out.println("Fectorial of "+factorialNumber +" is "+fact);
	}

}
