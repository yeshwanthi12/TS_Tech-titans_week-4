package Exception;

 class Throw {
	String name;
	int age;
	void details() {
	System.out.println("student details");
	}
class FileNotFoundException extends Throw 
{
	void details1() {
	
	System.out.println("error");
}
	public void main(String args[]) {
		Throw o=new Throw();
		o.details();
		
		
	}
	
}



}
