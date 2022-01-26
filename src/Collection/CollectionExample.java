package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		
		for(int i = 0; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = (Integer)e.nextElement();
			System.out.println(i);
		}
		System.out.println(v);
		
		for(int j = 0; j< v.size();j++) {
			
			System.out.println(v.get(j));
		}
	}

}
