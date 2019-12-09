package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
	public static void main(String args[]) {
		ArrayList ob=new ArrayList();
	    ob.add("yeshu");
	    ob.add("sul");
	    ob.add("mahitha");
	    ob.add(2);
	    ob.add(4.3);
	    ob.remove(2);
	    ob.add(4,"sul");
	   System.out.println(ob);
	    Iterator i=ob.iterator();
	    while(i.hasNext());
	    {
	    System.out.println(i.next());
	}

	}
}

	    
	    
		
		
	
		
	