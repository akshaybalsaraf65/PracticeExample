package GarbejCollector;

public class GarbejCollectorExample5 {

	static GarbejCollectorExample5 s;
	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		GarbejCollectorExample5 f = new GarbejCollectorExample5();
		System.out.println(f.hashCode());
		f = null;
		System.gc();
		Thread.sleep(5000);
		//System.out.println(f.hashCode());
		s = null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("End Of Main Method");
		
		for(int i = 0; i< 10; i++) {
			
			GarbejCollectorExample5 g = new GarbejCollectorExample5();
			g = null;
		}
	}
	
	public void finalize() {
		
		System.out.println("finalize method called" + ++count);
		s = this;
	}

}
