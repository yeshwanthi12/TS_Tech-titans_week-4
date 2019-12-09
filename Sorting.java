package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String arg[]) 
	{
		String name[]= new String[5];
		int rank[]= new int[5];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the names");
		for(int i=0;i<5;i++)
		{
			name[i] = s.nextLine();	
		}
		Arrays.sort(name);
		System.out.println("After sorting names are:" );
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("Enter the numbers:");
		for(int j=0;j<5;j++)
		{
			rank[j] = s.nextInt();
		}
		
		Arrays.sort(rank);
		System.out.println("After sorting numbers are:");
		for(int j=0;j<5;j++)
		{
			System.out.println(rank[j]);
		}
	}
}


