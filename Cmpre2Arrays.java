package Collections;

import java.util.ArrayList;
import java.util.List;

public class Cmpre2Arrays {
	public static void main(String args[]) {
		List<Integer> s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		List<Integer> s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		System.out.println(s1);
		System.out.println(s.equals(s1));
	}

}
