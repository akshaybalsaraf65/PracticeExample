package PraacticeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List s = new ArrayList();
		s.add(10);
		s.add(7);
		s.add(20);
		s.add(14);
		s.add(35);
		s.add(21);
		s.add(28);
		s.add(25);
		s.add(30);
		s.add(35);
		s.add(40);
		s.add(45);
		s.add(50);
		System.out.println(s);
		
		int count = 0;
		for(int i = 0;i < s.size();i++) {
			
			int j = (int) s.get(i);
			
			if(j%7==0) {
				
				if(count < 7) {
					System.out.println(j + ",");
				}
				count++;
			}
			
		}
		
		
		
	}

}
