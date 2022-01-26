package Collection;

import java.util.TreeMap;

public class CollectionTreemapExample {

	public static void main(String[] args) {
		
		TreeMap m = new TreeMap(new CollectionTreemapComparatorExample());
		m.put("akak", 100);
		m.put("zasd", 101);
		m.put("akii", 140);
		m.put("zxcd", 140);
		System.out.println(m);
		
		TreeMap m1 = new TreeMap(m);
		System.out.println(m1);
				
				
				
	}
}
