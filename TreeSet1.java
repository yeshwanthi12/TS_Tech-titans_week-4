package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String args[]) {
		TreeSet o=new TreeSet();
		o.add(50);
		o.add(100);
		o.add(30);
		o.add(10);
		o.add(60);
		o.remove(10);
		Iterator i=o.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	

}
