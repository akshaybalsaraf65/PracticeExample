package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionLinkedHashmapExample {

	public static void main(String[] args) {

		
		LinkedHashMap m = new LinkedHashMap();
		m.put("ak", 101);
		m.put("akii", 102);
		m.put("akak", 103);
		m.put("akaii", 104);
		m.put("ak", 105);
		System.out.println(m);
		System.out.println(m.put("ak", 110));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
			
			if(m1.getKey().equals("akii")) {
				m1.setValue(120);
			}
		}
		System.out.println(m);
	
	}
}



