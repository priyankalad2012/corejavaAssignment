package pettern;

public class P5 {
	public static void main(String[] args) {
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		

		
			int lines = 8;
			int starCount = lines;
			int spaceCount = 0;
			for(int j=1;j<=lines;j++)
			{
				for(int k=1;k<=spaceCount;k++)
				{
					System.out.print(" ");
				}
				
				for(int i=1;i<=starCount;i++)
				{
					System.out.print("*");
				}
				System.out.println();
				starCount--;
				spaceCount++;
			}
		
		
		
	}
}
