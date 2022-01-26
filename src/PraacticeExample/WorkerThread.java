package PraacticeExample;

public class WorkerThread implements Runnable{

	private String message;
	
	public WorkerThread(String s) {
		this.message = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + "(Start) message = " + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " (End) ");
	}
	
	public void processmessage() {
		
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}
}
