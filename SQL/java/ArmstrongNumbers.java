package Arrays;

public class ArmstrongNumbers {
	public static void main(String args[])
		{
			
			int sum;
			int temp;
			int digit;
			for(int i=0;i<=1000;i++)
			{
				temp=i;
				sum=0;
				while(temp!=0) {
					digit=temp%10;//remainder
					//System.out.println("digit is" +digit);
					sum=sum+digit*digit*digit;
					//System.out.println("sum is" +sum);
					temp=temp/10; //Quotient
							
				}
				if(sum==i)
				{
					System.out.println(i + "is an armstrong number" );
				}
			}
			
			
		}
		

	}


