package Arrays;

public class DuplicateString {
	public static void main(String args[]) {
		String name[]= {"yeshu","mahitha","chan","yeshu"};
		 System.out.println("Duplicate elements in given array: ");  
		 for(int i = 0; i < name.length; i++) {  
		 for(int j = i + 1; j < name.length; j++) {  
			 if(name[i] == name[j])  
		         System.out.println(name[j]);                  
			            }  
		 }
	}
	}


