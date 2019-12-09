package Arrays;

import java.util.Scanner;

public class ValueTestInArray {
	public static void main(String[] args)
	{
		int num[]= {10,50,7,68,45,96,78,21,-9,54};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		int value = s.nextInt();
		for(int i=0;i<num.length;i++)
		{
			if(num.length==value)
			{
				System.out.println("The value " +value +" is in the array");
				break;
			}
			else 
				System.out.println("The value" +value +" is not in the array");
			break;
		}

	}
}
