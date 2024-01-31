package AssignmentCoreJava;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of row : ");
		int lines= sc.nextInt();
		int startcount= 1;
		int j,i;
		for ( j=1;j<=startcount;j++)
		{
			for( i=1;i<=startcount;i++)
			{
				if(j==i)
				{
					System.out.println("1");
					
				}
				else 
				{
					System.out.println("0");
				}
			}
		}
		System.out.println();
		startcount=startcount+2;

	}

}
