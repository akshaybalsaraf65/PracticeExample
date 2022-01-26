package Collection;

import java.util.Hashtable;

public class CollectionHashtableExample {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable(25);
		h.put(new Temp1(10), "ak");
		h.put(new Temp1(5), "akaki");
		h.put(new Temp1(7), "akii");
		h.put(new Temp1(9), "akakii");
		h.put(new Temp1(2), "akakakakii");
		h.put(new Temp1(23), "akaki");
		h.put(new Temp1(15), "akaki");
		h.put(new Temp1(2), "akakakakii");
		System.out.println(h);
	}
}
