package array;

public class A004_MDArray2 {
	public static void main(String[] args) {
		
		
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};		
		int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++++++");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
