package Arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = new int[5];
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<5;i++)
		{
			num[i] = s.nextInt();
			sum = sum+ num[i];
		}
		System.out.println("the sum of values is:" +sum);
	}
}
