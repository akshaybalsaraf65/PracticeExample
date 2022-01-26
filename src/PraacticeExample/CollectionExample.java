package PraacticeExample;

import java.util.HashMap;
import java.util.Map.Entry;

import com.sun.javafx.collections.MappingChange.Map;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put(null, null);
		
		System.out.println(hm);
		
		for(Entry<String, String> m:hm.entrySet()) {
			
			hm.put("ak", "ak");
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
