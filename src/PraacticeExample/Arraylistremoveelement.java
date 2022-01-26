package PraacticeExample;

import java.util.ArrayList;

public class Arraylistremoveelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(52);
		al.add(45);
		al.add(10);
		al.add(10);
		
		
		for(int i = 0; i< al.size();i++) {
			
			if(i<6) {
				
				System.out.println(al.get(i));
				
			}else {
				
				al.remove(al.get(i));
			}
		}
	}

}
