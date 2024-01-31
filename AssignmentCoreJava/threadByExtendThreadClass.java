package AssignmentCoreJava;

class th1 extends Thread
{
	public void run() {
		
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

class th2 extends Thread
{
	public void run() {
		
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
			System.out.println("thread2 :  "+ i);
		}
		
	}
}








public class threadByExtendThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		th1 t1=new th1();
		th2 t2=new th2();
		t1.start();
		t2.start();

	}

}
