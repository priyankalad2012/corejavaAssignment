package AssignmentCoreJava;

import java.util.Arrays;

public class SecondLargestInArray {
	
	public static int getSecondLargest(int[]a, int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,99,88,336,565,797,121,999};
		System.out.println("second lagest number : "+getSecondLargest(a, 9));
		
		
		
		
		
		
		
		
	}

}
