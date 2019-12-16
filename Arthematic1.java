package Exception;

public class Arthematic1 {
	public static void main(String args[]) {
		try
		{
		//int num=10;
		int num1=20/0;
		
		System.out.println("result is " +num1);
		
	}
catch(Exception e)
{
System.out.println(e);	
}
		finally
		{
			System.out.println("numbers");
		}
}
}
