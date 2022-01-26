package PraacticeExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = new ArrayList<String>();
		str.add("ak");
		str.add("akshay");
		str.add("akaki");
		str.add("akakka");
		
		System.out.println(str);
		
		Iterator<String> itt = str.iterator();
		while(itt.hasNext()) {
			
			String next = itt.next();
			System.out.println(next);
			if(next.equals("akshay")) {
				
				//str.remove("akshay");
			}
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();  
        map.put(1, 1);  
        map.put(2, 2);  
        map.put(3,3);
        
        System.out.println(map);
        
        Iterator<Integer> it = map.keySet().iterator();  
        while(it.hasNext()) {  
            Integer key = it.next();  
            System.out.println("Map Value:" + map.get(key));  
            if (key.equals(2)) {  
                map.put(1, 4);  
            }  
        } 
	}

}
