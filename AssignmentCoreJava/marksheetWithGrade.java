package AssignmentCoreJava;

import java.util.Scanner;

public class marksheetWithGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Merks : ");
		double marks=sc.nextDouble();
		if(marks<=100 && marks>=91 )
		{
			System.out.println("Grade A");
		}
		else if(marks<=90 && marks>=81 )
		{
			System.out.println("Grade AB");
		}
		else if(marks<=80 && marks>=71 )
		{
			System.out.println("Grade BB");
		}
		else if(marks<=70 && marks>=61 )
		{
			System.out.println("Grade BC");
		}
		else if(marks<=60 && marks>=51 )
		{
			System.out.println("Grade CD");
		}
		else if(marks<=50 && marks>=41 )
		{
			System.out.println("Grade DD");
		}
		else if(marks<=40 && marks>=0 )
		{
			System.out.println("Fail");
		}
		

	}

}
