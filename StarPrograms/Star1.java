package StarPrograms;

public class Star1 {
	public static void main(String args[]) {
		int i, j;
		for( i=0;i<5;i++)
		{
			for(j=2*(4-i);j>=0;j--)//spaces
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		
		}
			
	}

}

