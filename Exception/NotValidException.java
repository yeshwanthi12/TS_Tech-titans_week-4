package Exception;

 class NotValidException extends Exception {
	 NotValidException() {
	}
	 void age(int age) {
		if(age<18) 
			throw new ArithmeticException("not valid age to vote");
	 
	 else {
		 System.out.println("right to vote");
 }
	 }
 public static void main(String args[]) {
	 int age=15;
	 try {
		NotValidException o=new NotValidException();
		 throw new NotValidException();
	 }
	 catch(Exception e) {
		 System.out.println(e);
		
	 }
 }
 
	

}
