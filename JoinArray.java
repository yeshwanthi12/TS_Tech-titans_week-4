package Collections;

import java.util.ArrayList;

public class JoinArray {
	public static void main(String args[]) {
	ArrayList a=new ArrayList();
	a.add("red");
	a.add("blue");
	a.add("yellow");
	a.add("green");
	ArrayList a1=new ArrayList();
	a1.add("pink");
	a1.add("orange");
	a1.addAll(a);
	System.out.println(a1);
	
	}
}
