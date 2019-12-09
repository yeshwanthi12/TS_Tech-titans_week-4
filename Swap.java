package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("array list before swapping:" +a);
		Collections.swap(a, 0, 3);
		System.out.println("array list after swapping:" +a);
		//System.out.println(a);

		
		
		
		
	}

}
