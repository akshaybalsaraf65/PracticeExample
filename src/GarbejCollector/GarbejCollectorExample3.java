package GarbejCollector;

import java.util.Date;

public class GarbejCollectorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i = 0; i <= 1000; i++) {
			
			Date d = new Date();
			d = null;
		}
		System.out.println(r.freeMemory());
		System.gc();
		System.out.println(r.freeMemory());
	}

}
