package pettern;

public class P2 {
	public static void main(String[] args) {
		
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int j=1;j<=5;j++)
//		{
//			for(int i=1;i<=j;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
			int lines = 8;
			int starCount = 1;
			for(int j=1;j<=lines;j++)
			{
				for(int i=1;i<=starCount;i++)
				{
					System.out.print("*");
				}
				System.out.println();
				starCount++;
			}
		
		
		
	}
}
