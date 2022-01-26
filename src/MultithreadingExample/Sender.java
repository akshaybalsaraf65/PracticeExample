package MultithreadingExample;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

	private Data data;
	
	public Sender(Data data2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String packets[] = {
				"First packet",
				"Second packet",
				"Third packet",
				"Four packet",
				"End"
		};
		
		for(String packet : packets) {
			
			data.send(packet);
			
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
