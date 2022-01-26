package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayclassExample {

	public static void main(String[] args) {
		
		int a[] = {10,20,50,70,30,60,80};
		System.out.println(a[0]);
		for(int a1:a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		for(int a1:a) {
			System.out.println(a1);
		}
		int s = Arrays.binarySearch(a, 50);
		System.out.println(s);
		
		ArrayList l = new ArrayList();
		l.add("ak");
		l.add("akaki");
		l.add("akii");
		l.add("akakiiii");
		System.out.println(l);
		
		List l1 = Arrays.asList(l);
		System.out.println(l1);
		l.add("akakakiiii");
		l.add("akiii");
		l.add("akakiiiiiiii");
		l.add("akakiiiiiiiiiii");
		l.add("akakkaiiiiiiiiiii");
		System.out.println(l);
		System.out.println(l1);
		a[0]=80;
		System.out.println(a[0]);
	}
}
