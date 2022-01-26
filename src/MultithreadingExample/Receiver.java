package MultithreadingExample;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {

	private Data load;
	
	public Receiver(Data data) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(String receivedMessage = load.receive();
				!"End".equals(receivedMessage);
				receivedMessage = load.receive()) {
			
			System.out.println(receivedMessage);
			
			try {
				
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			
		}
	}

}
