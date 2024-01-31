package AssignmentCoreJava;

import java.util.Scanner;

public class minAndMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter size of array : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		//int i;
		for (int i=0; i<arr.length;i++)
		{
			System.out.println("enter value for index : " +i);
			arr[i]=sc.nextInt();
			//System.out.println(i+" index of "+arr[i]);
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		}
		System.out.println("maximum value of array is : "+ max);
		System.out.println("Minimum value of array is : "+ min);

	}

}
