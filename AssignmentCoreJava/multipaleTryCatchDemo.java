package AssignmentCoreJava;

public class multipaleTryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			int a[]=new int [5];
			a[6]=70;
			
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
