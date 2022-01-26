package Collection;

import java.util.TreeMap;

public class CollectionNaviganleMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, String> t = new TreeMap<String,String>();
		t.put("a", "ak");
		t.put("ak", "aki");
		t.put("akii", "akakii");
		t.put("akakiiii", "akakiiii");
		System.out.println(t);
		System.out.println(t.floorKey("ak"));
		System.out.println(t.lowerKey("ak"));
		System.out.println(t.ceilingKey("ak"));
		System.out.println(t.higherKey("ak"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
	}
}
