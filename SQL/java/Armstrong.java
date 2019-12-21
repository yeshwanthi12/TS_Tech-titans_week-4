package Arrays;

public class Armstrong {
	public static void main(String args[])
	{
		int num=153;
		int sum=0;
		int temp=num;
		int digit;
		while(temp!=0) {
			digit=temp%10;//remainder
			System.out.println("digit is" +digit);
			sum=sum+digit*digit*digit;
			System.out.println("sum is" +sum);
			temp=temp/10; //Quotient
					
		}
		if(sum==num)
		{
			System.out.println(num + "is an armstrong number" );
		}
	}
	

}
