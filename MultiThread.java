package MultiThreading;

public class MultiThread extends Thread {
	public void run()
	{
		for(int i=0;i<=6;i++)
		{
			try
			{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
			{
			System.out.println(e);
			} 
			System.out.println(i);
		}
		
		
	}
		public static void main(String args[])
		{
			MultiThread m=new MultiThread();
			m.start();
			MultiThread m1=new MultiThread();
			try
			{
				m.join(5000);
			}
			catch(InterruptedException e)
			{
			System.out.println(e);	
			}
			m1.start();
		}
	
	
	

}
