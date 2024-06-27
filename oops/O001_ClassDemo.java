package oops;

class Pen
{
	static int price = 10;
	String color="red";
	String company="cello";
	
	 public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("runing display");
	}
}

public class O001_ClassDemo {
	public static void main(String[] args) {
		
		Pen.price = 100;
		
		Pen p = new Pen();
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.toWrite();  
		
		Pen.display();
		
		AccessModifier mod = new AccessModifier();
		mod.display();	
	}
}
