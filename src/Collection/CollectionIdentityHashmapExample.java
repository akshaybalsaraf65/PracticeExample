package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class CollectionIdentityHashmapExample {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1, "akak");
		m.put(i2, "akaki");
		System.out.println(m);
		
		IdentityHashMap m1 = new IdentityHashMap();
		Integer i11 = new Integer(10);
		Integer i22 = new Integer(10);
		
		m1.put(i11, "akak");
		m1.put(i22, "akaki");
		System.out.println(m);
	}
}
