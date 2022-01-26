package PraacticeExample;

import java.util.HashMap;

public class DuplicateCount {

	static void DuplicateData(String str) {
		
		String[] s = str.split(" ");
		
		HashMap m = new HashMap();
		
		for(String ss : s) {
			
			//System.out.println(ss);
			if(m.get(ss) != null) {
				
				m.put(ss, m.get(ss));
			}
			m.put(s, 1);
		}
		
		System.out.println(m.toString());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateData("I am akshay Balsaraf am from koparkhairane I am cool I am rock");
	}

}
