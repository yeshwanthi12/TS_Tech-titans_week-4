package Arrays;

public class CopyAnArray {
	public static void main(String args[]) {
		int num[]= {1,2,3,4,5};
		int newArray[]=new int[5];
	
	for(int i=0;i<num.length;i++) {
		newArray[i]=num[i];	
		System.out.println(newArray[i]);
		
	}
	}
}
