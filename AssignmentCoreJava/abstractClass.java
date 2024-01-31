package AssignmentCoreJava;
abstract class Parent
{
	public void message()
	{
		System.out.println("parent class....");
	}
}
class subclass1 extends Parent
{
	public void message()
	{
		System.out.println("This is first subclass");
	}
}
class subclass2 extends Parent
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
}
public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
subclass1 sb1=new subclass1();
sb1.message();

subclass2 sb2=new subclass2();
sb2.message();
	
	}
}
