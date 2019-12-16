package ControlStatements;

import java.util.Scanner;

public class NaturalNumbers_1toN {
	public static void main(String args[]) {
		int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values n: ");
		int n =s.nextInt();
		System.out.println("nubers are: ");
		while(i<=n)
		{
		System.out.println(i);	
		i++;
		}
	}

}
