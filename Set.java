package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String[] args) {
		HashSet o=new HashSet();
		o.add(10);
		o.add(20);
		o.add(50);
		o.add(40);
		o.add(10);
		o.add("lohith");
		o.remove(20);
		//o.clear();
		Iterator i=o.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	}

}
}
