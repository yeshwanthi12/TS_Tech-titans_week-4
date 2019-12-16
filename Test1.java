package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String args[]){  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(1,"yeshu",26));  
		al.add(new Student(2,"mahitha",25));  
		al.add(new Student(3,"sul",22));  
		  
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		}  
	

}
