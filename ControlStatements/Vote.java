package ControlStatements;

import java.util.Scanner;

public class Vote {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");	
		}
		
		
	}

}
