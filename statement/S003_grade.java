package statement;

import java.util.Scanner;

public class S003_grade {
	public static void main(String[] args) {
		  
		int marks = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		marks= sc.nextInt();
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("Grade c");
		}
		else if(marks>34 && marks<=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>0 && marks<=34)
		{
			System.out.println("Grade F");
		}
		else
		{
			System.out.println("Invalid input");
		}
		}while(marks!=0);
		
	}
}
