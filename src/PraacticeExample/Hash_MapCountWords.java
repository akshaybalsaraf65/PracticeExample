package PraacticeExample;

import java.util.HashMap;

public class Hash_MapCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hello i am akshay i am cool";
		
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		
		String[] words = str.split(" ");
		
		for(String word : words) {
			
			//System.out.println(word);
			
			Integer integer = hash_map.get(word);
			System.out.println(integer);
			if(!hash_map.containsKey(word)) {
				
				if(integer == null) {
					
				hash_map.put(word, 1);
				
				}else {
					
					hash_map.put(word, integer + 1);
				}
			}else {
					
				hash_map.put(word, integer + 1);
			}
			
//			if(integer == null) {
//				
//				hash_map.put(word, 1);
//			}else {
//				
//				hash_map.put(word, integer + 1);
//			}
		}
		System.out.println(hash_map);
	}

}
