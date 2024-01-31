package AssignmentCoreJava;

import java.util.Scanner;

public class binaryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of lines : ");
		int lines=sc.nextInt();
		
		int startCount=1;
		for(int j=1; j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				if(i%2==j%2)
				{
					System.out.print("1");
					
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
			startCount++;
			
		}
		
		
	}

}
