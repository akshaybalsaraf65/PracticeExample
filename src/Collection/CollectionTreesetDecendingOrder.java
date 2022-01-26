package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionTreesetDecendingOrder {

	public static void main(String[] args) {
		
		TreeSet s = new TreeSet(new CollectionTreesetComparator());
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(45);
		s.add(45);
		s.add(65);
		s.add(45);
		s.add(5);
		System.out.println(s);
	}
}
