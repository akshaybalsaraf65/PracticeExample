package PraacticeExample;

import java.util.Comparator;

class CollectionsComparatorrExample implements Comparator<CollectionsComparatorStudentExample>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(CollectionsComparatorStudentExample o1, CollectionsComparatorStudentExample o2) {
		// TODO Auto-generated method stub
		
		CollectionsComparatorStudentExample s1=(CollectionsComparatorStudentExample)o1;  
		CollectionsComparatorStudentExample s2=(CollectionsComparatorStudentExample)o2;  
		  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
	}

	
}
