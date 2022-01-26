package Collection;

import java.util.TreeSet;

public class Employee implements Comparable{

	String name;
	int id;
	
	Employee(String name, int id){
		
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + id;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		int eid1 = this.id;
		Employee e = (Employee) o;
		int eid2 = e.id;
		if(eid1 < eid2)
			return -1;
		else if(eid1 > eid2)
			return +1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("akak", 10);
		Employee e1 = new Employee("zaza", 20);
		Employee e2 = new Employee("tanis", 5);
		Employee e3 = new Employee("libvs", 50);
		Employee e4 = new Employee("zxiu", 40);
		TreeSet s = new TreeSet();
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s);
		TreeSet s1 = new TreeSet(new CollectionTreesetComparator1());
		s1.add(e);
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		System.out.println(s1);
		TreeSet s2 = new TreeSet(s);
		System.out.println(s2);
		TreeSet s3 = new TreeSet(s);
		System.out.println(s3);
	}
}
