package Arrays;

public class CommonInteger {
	public static void main(String args[]) {
		int num[]={3,8,6,9,2,4};
		int num1[]={1,10,3,5,15,9};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num1.length;j++)	
			{
				if(num[i]==num1[j])
				{
					System.out.println(num1[j]);
				}
			}
		}
	}
}

		
		 
		