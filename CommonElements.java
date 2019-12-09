package Arrays;

public class CommonElements {
	public static void main(String args[]) {
		String a[]= {"java","sql","html","css"};
		String a1[]={"php","java","testing","c++"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a[i]==a1[j])
				{
					System.out.println(a1[j]);
				}
			}
		}
	}

}
