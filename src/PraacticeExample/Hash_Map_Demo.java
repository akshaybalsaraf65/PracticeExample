package PraacticeExample;

import java.util.HashMap;

public class Hash_Map_Demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(10	, "akshay");
		hash_map.put(15, "akii");
		hash_map.put(20, "prakesh");
		hash_map.put(25, "manoj");
		
		System.out.println(hash_map);
		String s = hash_map.get(10);
		System.out.println(s);
		String i = hash_map.get(20);
		System.out.println(i);
		
		System.out.println(hash_map.size());
	}
}
