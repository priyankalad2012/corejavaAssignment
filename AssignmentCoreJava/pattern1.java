package AssignmentCoreJava;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter no. of row : ");
		int lines= sc.nextInt();
		int startCount=1;
		
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startCount;i++)
			{
				System.out.print(i);

			}
			System.out.println();
			startCount++;
		}

	}

}
