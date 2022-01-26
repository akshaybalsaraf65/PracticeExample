package Collection;

import java.util.PriorityQueue;

public class CollectionPriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());
		for(int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
		
		PriorityQueue q1 = new PriorityQueue<>(15, new CollectionTreemapComparatorExample());
		q1.offer("ak");
		q1.offer("zzmmz");
		q1.offer("akki");
		q1.offer("zxdd");
		System.out.println(q1);
	}
}
