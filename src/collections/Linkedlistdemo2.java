package collections;

import java.util.LinkedList;

public class Linkedlistdemo2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("cat");
		ll.add("dog");
		ll.add("rat");
		ll.add("horse");
		ll.add("lion");
		ll.add("elephant");
		System.out.println(ll);
		ll.addFirst(" cow");
		System.out.println(".....after adding element at first........");
		System.out.println(ll);
		
		ll.addLast(" goat");
		System.out.println(".....after adding element at last........");
		
		
		System.out.println(ll);
		ll.remove(" horse");
		
		System.out.println(".....after removing element........");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(".......after removing first element......");
		System.out.println(ll);
		System.out.println("size of the linked list is:" +ll.size());
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
