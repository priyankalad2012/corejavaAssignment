package oops;

class Demo
{
	static int count = 0;
	Demo()
	{
		//System.out.println("cons calling...");
		count++;
		
	}
	
}

public class O004_StaticDemo
{
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		System.out.println(Demo.count);
	}
}
