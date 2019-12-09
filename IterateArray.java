package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArray {
	public static void main(String[]args) {
		ArrayList o=new ArrayList();
		o.add("yeshu");
		o.add("mahitha");
		o.add("chan");
		o.add(1);
		Iterator i=o.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
