package GarbejCollector;

public class GarbejCollectorExample2 {

	GarbejCollectorExample2 i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbejCollectorExample2 t1 = new GarbejCollectorExample2();
		GarbejCollectorExample2 t2 = new GarbejCollectorExample2();
		GarbejCollectorExample2 t3 = new GarbejCollectorExample2();
		
		t1.i = t2;
		t2.i = t3;
		t3.i = t1;
		
		System.out.println(t1.i);
		System.out.println(t2.i);
		System.out.println(t3.i);
		
		t1 = null;
		t2 = null;
		t3 = null;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
