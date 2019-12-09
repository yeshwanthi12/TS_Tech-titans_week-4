package Collections;

import java.util.HashMap;

//import java.util.HashMap;
public class HashM1 {
	public static void main(String args[])
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"yeshu");
		h.put(2,"mahitha");
		h.put(3,"sul");
		System.out.println("initial elements:" +h);
		h.remove(3);
		System.out.println("updated list:" +h);
		
	}

}
