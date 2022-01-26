package PraacticeExample;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		
		ll = reverseLinkedList(ll);
		
		System.out.println(ll);

	}
	
	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
		
		LinkedList<Integer> rereverseLinkedList = new LinkedList<Integer>();
		
		for(int i = list.size()-1;i>=0;i--) {
			
			rereverseLinkedList.add(list.get(i));
		}
		return rereverseLinkedList;
	}

}
