package GarbejCollector;

public class GarbejCollectorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = new String("ak");
		GarbejCollectorExample4 s = new GarbejCollectorExample4();
		s.finalize();
		s.finalize();
		s = null;
		System.gc();
		System.out.println("End Of Main Method");
	}
	
	public void finalize() {
		
		System.out.println("finalize method called");
	}

}
