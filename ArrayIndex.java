package Arrays;

public class ArrayIndex {
	public static void main(String args[]) {
	//int[]age=new int[5];
	int[] age= {10,11,12,13,14};
	int a = 11;
	//System.out.println(indexOf(age[11]));
	
	for(int i=0;i<age.length;i++)
	{
		if(age[i] == a) {
			System.out.println(i);
		}
	}
   }
}
