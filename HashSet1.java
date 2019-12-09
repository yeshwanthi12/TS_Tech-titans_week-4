package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String args[]) {
		HashSet o=new HashSet();
		o.add("yeshu");
		o.add("mahitha");
		o.add("sul");
		o.add("yeshu");
		o.add("lohith");
		o.add("bhargavi");
		o.remove("mahitha");
		//o.clear();
		Iterator i=o.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
