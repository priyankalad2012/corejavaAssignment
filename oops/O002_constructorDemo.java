package oops;

class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("constructor calling...");
	}
	
	Student(String name)
	{
	 System.out.println("My name is : "+name);	
	}
	
	Student(int i)
	{
		System.out.println(i);
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class O002_constructorDemo {
	public static void main(String[] args) {
		
		
		Student st = new Student(10,"Fenal");
		st.display();
		
		Student st1 = new Student(11,"Priyanka");
		st1.display();
		
	}
}
