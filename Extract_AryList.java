package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Extract_AryList {
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(100);
		a.add(50);
		System.out.println(a);
		System.out.println(a.subList(0,3));
	}
}
