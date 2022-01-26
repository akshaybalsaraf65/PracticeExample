package PraacticeExample;

public class TestDeadLockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String resource1 = "ak ak";
		final String resource2 = "akak akak";
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				
				synchronized(resource1) {
					
					System.out.println("Thread 11: locked resource 1");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					synchronized(resource2) {
						
						System.out.println("Thread 1: locked resource 2");
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				
				synchronized(resource2) {
					
					System.out.println("Thread 22: locked resource 2");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					synchronized(resource1) {
						
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
			
		};
		
		t1.start();
		t2.start();
		
	}

}
