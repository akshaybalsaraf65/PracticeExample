package PraacticeExample;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("ak", "ak");
		hashtable.put("aki", "aki");
		hashtable.put("aky", "aky");
		hashtable.put("akyyii", "akyyii");
		hashtable.put("ak", "ak");
		
		System.out.println(hashtable);
		
		for(Map.Entry<String, String> entry:hashtable.entrySet()) {
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "" + value);
		}
	}

}
