package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionConcurentModificationExceptionExample extends Thread{

	static ArrayList l = new ArrayList();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("child thread updated list");
			e.printStackTrace();
		}
		super.run();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		l.add("ak");
		l.add("akii");
		l.add("akii");
		l.add("akakai");
		CollectionConcurentModificationExceptionExample c = new CollectionConcurentModificationExceptionExample();
		c.start();
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("main thread iterator current object" +s);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
	
}
