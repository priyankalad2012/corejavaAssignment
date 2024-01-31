package AssignmentCoreJava;

public class sumofFirst100PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0 ;
		for(int number=1; number<=100;number++)
		{
			int flag=0;
			for (int i=2;i<number;i++)
			{
				if(number %i==0)
				{
					
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				
				sum=number+sum;
				number ++;
				
				
				
			}
		
		}
		System.out.println("sum of the first 100 prime numbers is  "+ sum);
	}

}
