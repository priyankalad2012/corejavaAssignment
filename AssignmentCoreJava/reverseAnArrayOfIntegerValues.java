package AssignmentCoreJava;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseAnArrayOfIntegerValues {

	
	public static void reverse(Integer a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		//Integer arr=sc.nextBigInteger();
		
		Integer[] arr= {10,20,30,40,50,60};
		
		reverse(arr);
		
		
		

	}

}
