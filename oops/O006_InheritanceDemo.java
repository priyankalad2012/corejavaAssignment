package oops;

class A
{
	int i = 10;
	
	public void display()
	{
		System.out.println(i);
		System.out.println("running class a display");
	}
}

class B extends A
{
	int i=50;
	public void show()
	{
		int i=100;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println("running show");
	}
}
class C extends B
{
	
}

public class O006_InheritanceDemo {
	public static void main(String[] args) {
		
//		B b = new B();
//		b.show();
		
		//upcastiong
		//A a = new B();
		
		//down castiong
		//B b = new A();
		
		System.out.println(new B() instanceof A);
		System.out.println(new A() instanceof B);
	}
}
