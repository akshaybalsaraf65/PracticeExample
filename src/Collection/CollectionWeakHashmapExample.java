package Collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class CollectionWeakHashmapExample {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "ak");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
		WeakHashMap m1 = new WeakHashMap();
		Temp t1 = new Temp();
		m1.put(t1, "ak");
		System.out.println(m1);
		t1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m1);
	}
}
