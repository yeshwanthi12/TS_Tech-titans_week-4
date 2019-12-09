package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Cpy_ArrayList {
	public static void main(String args[]) {
	ArrayList a=new ArrayList(); {
		a.add("yes");
		a.add("mahi");
		a.add("chan");
		a.add("yeshu");
		System.out.println(a);
		ArrayList a1=new ArrayList(); 
		
			
			a1.add("ab");
			a1.add("m");
			a1.add("ch");
			a1.add("ye");
			a1.add("yesss");
			Collections.copy(a1, a);
			
			System.out.println(a1);
			
		
	}

	}
}
