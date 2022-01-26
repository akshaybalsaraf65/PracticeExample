package PraacticeExample;

import java.util.HashMap;
import java.util.Iterator;

public class hashmaphashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 10);
		hm.put("b", 20);
		
		System.out.println(hm.hashCode());
		
		Iterator itr = (Iterator) hm.entrySet();
		while(itr.hasNext()) {
			
			System.out.println(hm.get(itr));
		}
	}

	@Override
	public int hashCode() {
		
		int hash = 1;
		System.out.println("call hashcode method override");
		return hash;
	}
}
