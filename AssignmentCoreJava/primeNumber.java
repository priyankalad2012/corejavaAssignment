package AssignmentCoreJava;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check prime or not? : ");
		int number = sc.nextInt();
		int flag = 0;
		for(int i=2; i<=number;i++)
		{
			flag = 0;
			if(number%i==0)
			{
			
			flag = 1;
			break;
			}
			if (flag==0)
			{
				System.out.println(number+ " number is prime");
				break;
			}
		}
		

	}

}
