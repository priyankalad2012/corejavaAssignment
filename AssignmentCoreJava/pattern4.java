package AssignmentCoreJava;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter no. of row : ");
		int lines= sc.nextInt();
		int startCount=1;
		int spaceCount=lines-1;
		
		for(int j=1;j<=lines;j++)
		{ 
			
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(j+ " ");

			}
			System.out.println();
			startCount++;
			spaceCount--;
			
		}



	}

}
