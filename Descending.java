package Arrays;

import java.util.Scanner;

public class Descending {
	
	public static void main(String args[]) {
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
			}
		}
		System.out.println("the decending order is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
			
		
			
		
		
			
		
	}


