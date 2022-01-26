package PraacticeExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsComparatorExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();  
		al.add(new CollectionsComparatorStudentExample(101,"Vijay",23));  
		al.add(new CollectionsComparatorStudentExample(106,"Ajay",27));  
		al.add(new CollectionsComparatorStudentExample(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new CollectionsComparatorrExample());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		CollectionsComparatorStudentExample st=(CollectionsComparatorStudentExample)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
		
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new CollectionsComparatorrExample());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		CollectionsComparatorStudentExample st=(CollectionsComparatorStudentExample)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}
