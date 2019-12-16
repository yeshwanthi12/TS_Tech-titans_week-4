package Exception;

import java.util.Scanner;

public class IndexOutOfBound {
	public static void main(String args[]) {
		try
		{
	
		int[] rollno=new int[5];
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			rollno[i]=s.nextInt();
			
		}
		}
		catch(Exception e)
		{
		System.out.println("wrong inputs " +e);	
		}
		finally
		{
		System.out.println("Hi");	
		}
	}
}
		
	
	
		
		
		
		
		
	
	


