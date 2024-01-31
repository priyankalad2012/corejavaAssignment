package AssignmentCoreJava;

import java.util.Scanner;

public class concatenate2tsring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter String1 ");
		String str1 = sc.next();
		System.out.println("enter String2 ");
		String str2 = sc.next();
		
		StringBuffer bff=new StringBuffer(str1);
		System.out.println(bff.append(str2));
		
		
		

	}

}
