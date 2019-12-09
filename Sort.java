package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String args[])
	{
		ArrayList s=new ArrayList(); {
			s.add(20);
			s.add(50);
			s.add(10);
			s.add(1);
			Collections.sort(s);
			System.out.println(s);
		}
	}

}	
