package PraacticeExample;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class longestsubstring {

	public static void main(String[] args) {
		
		String str = "hello i am akshay";
		HashSet hahset = new HashSet();
		
		
		for(int i = 0; i<str.length();i++) {
			
			char charAt = str.charAt(i);
			//System.out.println(charAt);
			
			//System.out.println("=============================================");
			if(!hahset.contains(charAt)) {
				hahset.add(charAt);
			}else {
				hahset.add(charAt);
			}
			
			
			
		}
		
		System.out.println(hahset);
	}
}
