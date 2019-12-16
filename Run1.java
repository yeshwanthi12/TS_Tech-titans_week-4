package MultiThreading;

public class Run1 implements Runnable {
	public void run()
	{
		System.out.println("Hi");
	}
	public static void main(String args[])
	{
		Run1 o=new Run1();
		Thread t=new Thread(o);
		t.start();
	}

}