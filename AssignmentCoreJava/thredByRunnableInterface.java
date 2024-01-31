package AssignmentCoreJava;

//import java.util.Scanner;

class thread1 implements Runnable
{
	public void run() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter i count number. : ");
		//int n= sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
			System.out.println("thread1 :  "+ i);
		}
		
	}
}
class thread2 implements Runnable
{
	public void run() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter j count number. : ");
		//int n2= sc.nextInt();
		for(int j=1;j<=10;j++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
			System.out.println("thread2 :  "+ j);
		}
		
	}
}





public class thredByRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 th1=new thread1();
		thread2 th2 =new thread2();
		
		Thread t1=new Thread(th1);
		
		Thread t2=new Thread(th2);
		
		t1.start();
		t2.start();
		
		

	}

}
