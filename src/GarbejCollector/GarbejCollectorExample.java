package GarbejCollector;

public class GarbejCollectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbejCollectorExample g1 = new GarbejCollectorExample();
		GarbejCollectorExample g2 = new GarbejCollectorExample();
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1 = null;
		g2 = null;
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1 = new GarbejCollectorExample();
		g2 = g1;
		System.gc();
		
		System.out.println(g1);
		System.out.println(g2);
		
		
		
	}
	
	public void finalize() {
		
		System.out.println("finalize method called");
	}

}
