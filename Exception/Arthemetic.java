package Exception;

public class Arthemetic {
	  
		  
	    public static void main(String[] args) {  
	    	try
	    	{
	          
	        int data=10/0;  
	        System.out.println("number is " +data);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	         finally
	         {
	        System.out.println("rest of the code");  
	          
	    }  
	    }
}
	 


