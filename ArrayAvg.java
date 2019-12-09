package Arrays;

import java.util.Scanner;

public class ArrayAvg {
	
		public static void main(String[] args)
		{
			double num[] = new double[5];
			double sum=0;
			Scanner s = new Scanner(System.in);
			System.out.println("The elements are:");
			for(int i=0;i<5;i++)
			{
				num[i] = s.nextDouble();
				sum = sum + num[i];
			}
			double average = sum/5;
			System.out.println("The average of the elements are:" +average);
		}
	}


