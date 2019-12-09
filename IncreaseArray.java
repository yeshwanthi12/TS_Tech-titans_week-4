package Collections;

import java.util.ArrayList;

public class IncreaseArray {
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add("yeshu");
		a.add("mahi");
		a.add("chan");
		System.out.println("Original array list: " + a);
          System.out.println("Let trim to size the above array: ");
          a.ensureCapacity(10);
          System.out.println(a);

}
}
