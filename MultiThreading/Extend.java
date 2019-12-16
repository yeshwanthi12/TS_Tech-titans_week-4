package MultiThreading;

public class Extend extends Thread {
	public void run()
	{
		System.out.println("yes");
	}
	public static void main(String args[]) {
		Extend o=new Extend();
		o.start();
	}

}
