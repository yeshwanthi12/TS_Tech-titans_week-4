package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
	public static void main(String args[]) {
		List a=new ArrayList();
		a.add("red");
		a.add("yellow");
		a.add("blue");
		a.add("green");
		System.out.println("before shuffing:" +a);
		Collections.shuffle(a);
		System.out.println("after shuffling:" +a); 
		
		
	}

}
