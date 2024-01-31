package AssignmentCoreJava;

public class tryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=50;
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
