package collections;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(1);
		l.add("first");
		l.add(2);
		l.add("second");
		l.add(3);
		l.add('w');
		System.out.println(l);
		System.out.println(l.size());
		System.out.println("adding the element in the linked list");
		l.add(2,"third");
		System.out.println(l);
		l.remove(4);
		System.out.println(("after removing the element in linked list"));
		System.out.println(l);
		System.out.println(l.size());
		l.set(5, "one");
		System.out.println("elements in list is"+l );
		//l.get(4);
		System.out.println(l.get(4));
		
		System.out.println(l.isEmpty());
		LinkedList g=new LinkedList();
		g.add(null);
		g.add(true);
		g.add(2);
		g.add(6);
		g.add("second");
		System.out.println(g);
		g.addAll(l);
		System.out.println(g);
		System.out.println(l.contains("fifth"));
		
		
		
		

	}

}
