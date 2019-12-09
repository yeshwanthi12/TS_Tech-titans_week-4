package Collections;

import java.util.ArrayList;

public class CloneArray {
	
		  public static void main(String[] args) {
		          ArrayList c1= new ArrayList();
		          c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");
		          System.out.println("Original array list: " + c1);
		          ArrayList c2 = (ArrayList) c1.clone();
		          System.out.println("Cloned array list: " + c2);       
		}
		}


