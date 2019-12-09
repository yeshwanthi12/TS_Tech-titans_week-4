package Arrays;

import java.util.*;
public class Sorting1 {
	public static void main(String args[]) {
	     int[] a=new int[5];
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter all the numbers");
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=s.nextInt();
	    	 
	     }
	     Arrays.sort(a);
	     System.out.println("sorted elements are ");
	     for(int i=0;i<a.length;i++)
	     {
	    	 System.out.println(a[i]);
	     }
		}

	}


