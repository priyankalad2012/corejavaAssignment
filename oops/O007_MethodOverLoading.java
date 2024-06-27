package oops;

class Calc1
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println(r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println(r);
	}
	
	public void add(int a, double b)
	{
		double r = a+b;
		System.out.println(r);
	}
}

public class O007_MethodOverLoading {
	public static void main(String[] args) {
		
		Calc1 c = new Calc1();
		c.add(102, 10);
		c.add(10, 20,36);
		c.add(10, 20.0);
	}
}
