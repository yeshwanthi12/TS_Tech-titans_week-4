package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String args[]) {
		LinkedList o=new LinkedList();
		o.add("yes");
		o.add("mahi");
		o.add("sul");
		o.remove(1);
		o.add(0,2 );
		o.addLast("y");
		o.addFirst("lohith");
		Iterator i=o.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
	}

}
