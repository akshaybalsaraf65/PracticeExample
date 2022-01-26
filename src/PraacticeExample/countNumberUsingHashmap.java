package PraacticeExample;
import java.util.HashMap;
import java.util.Map;

public class countNumberUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "write a words using hashmap";
		
		Map<String, Integer> hash_map = new HashMap<String, Integer>();
		
		String[] words = str.split(" ");
		
		
		for(String word : words) {
			
			Integer integer = hash_map.get(word);
			
			if(hash_map.containsKey(words)) {
				
				hash_map.put(word, hash_map.get(word) + 1);
			}else {
				hash_map.put(word, 1);
			}
		}
		
		System.out.println(hash_map);
	}

}
