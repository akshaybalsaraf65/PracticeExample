package Collection;

import java.util.Comparator;

public class CollectionTreesetComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		String s1 = e1.toString();
		String s2 = e2.toString();
		
		return s1.compareTo(s2);
	}

}
