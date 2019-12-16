package Comparator;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;

	public class ComparatorDemo1 {
		public static void main(String args[]){  
			  
			ArrayList al=new ArrayList();
			al.add(new Student(1,"Jack",38));  
			al.add(new Student(2,"Allen",18)); 
			al.add(new Student(3,"Taker",11));  
			al.add(new Student(4,"Rock",21)); 
			al.add(new Student(5,"Brock",29)); 

			System.out.println("Sorting by age");  
			  
			Collections.sort(al,new NameComparator()); 

			Iterator itr2=al.iterator();  
			while(itr2.hasNext()){  
			Student st=(Student) itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}   
			}  
			}  




