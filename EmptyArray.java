package Collections;

import java.util.ArrayList;

public class EmptyArray {
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		System.out.println(a);
		a.clear();
		System.out.println(a);

}
}
