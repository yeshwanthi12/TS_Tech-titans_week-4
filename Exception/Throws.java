package Exception;

import java.io.IOException;

public class Throws {
void deatils() throws IOException {
	String name = null;
	System.out.println(name.length());
}


public static void main(String args[]){  
	   try{  

		   Throws obj=new Throws();  
		   obj.deatils();  
		   
		  }
	   catch(Exception e){
		   System.out.println("exception handled" +e);}  
	  }  
	 
	  
	}  
	
	
	
	