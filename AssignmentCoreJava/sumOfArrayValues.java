package AssignmentCoreJava;

import java.util.Scanner;

public class sumOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter size of array : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i=0; i<arr.length;i++)
		{
			System.out.println("enter value for index : " +i);
			arr[i]=sc.nextInt();
			
		}
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array is : "+ sum);
	}

}
