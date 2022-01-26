package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsclassExample {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("ak");
		l.add("iffi");
		l.add("zxds");
		l.add("jsjs");
		//l.add(null);
		//l.add(new StringBuffer("kkdk"));
		int s = Collections.binarySearch(l, "ak");
		System.out.println(s);
		System.out.println(l);
		List<String> l1 =Collections.synchronizedList(l);
		System.out.println(l1);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l, new CollectionsSortComparatorExample());
		System.out.println(l);
		int s1 = Collections.binarySearch(l, "ak", new CollectionsSortComparatorExample());
		System.out.println(s1);
		Collections.reverse(l);
		Comparator c = Collections.reverseOrder(new CollectionsSortComparatorExample());
		System.out.println(l);
		
	}
}
