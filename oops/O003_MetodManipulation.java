package oops;

import java.util.Arrays;

class Calc
{
	public void display()
	{
		System.out.println("Runing display");
	}
	
	public void square(int a)
	{
		int sq = a*a;
		System.out.println("sq of "+a+" is "+sq);
	}
	
	public void getMessage(String msg)
	{
		System.out.println("My name is : "+msg);
	}
	
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("Result is : "+r);
	}
	
	public int cube(int num)
	{
		int r = num*num*num;
		return r;
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum of array is : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[c] = a[i];
			c++;
		}
		return b;
	}
	
	public void varArg(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println("var : "+a[i]);
		}
	}
}

public class O003_MetodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.display();
		c.square(10);
		c.square(5);
		c.getMessage("Tops");
		c.add(102, 10);
		
		int r =  c.cube(10);
		System.out.println(r);
		System.out.println(c.cube(5));
		
		int a[] = {10,20,30,40,50,60,70};
		int b[] = {1,2,3,4,5,6,7,8,9};
		c.addArray(a);
		c.addArray(b);
		
		int k[] =  c.revArray(a);
		System.out.println(Arrays.toString(k));
		System.out.println(Arrays.toString(c.revArray(b)));
		
		c.varArg(10,20,30,40,50,60,90);
		
		
	}
}
