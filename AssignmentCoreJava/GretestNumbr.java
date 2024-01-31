package AssignmentCoreJava;

import java.util.Scanner;

public class GretestNumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Value of Number 1:");
	
	int number1 = sc.nextInt();
	System.out.println("Value of Number 2:");
	int number2 = sc.nextInt();
	System.out.println("Value of Number 3:");
	int number3 = sc.nextInt();
	
	
	if (number1 > number2)
	{
		if(number1>number3)
		{
			System.out.println(number1 + "is greter then other");
		}
		else
		{
			System.out.println(number3 + "is greter then other");
		}
	}
	else
	{
		if(number2>number3)
		{
			System.out.println(number2 + "is greter then other");
		} 
		else
		{
			{
				System.out.println(number3 + "is greter then other");
			} 
		}
		
		
	}
		
		
	}
	

	}

