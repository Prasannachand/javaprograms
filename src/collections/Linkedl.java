package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedl {

	public static void main(String[] args) {
		LinkedList<Integer> s=new LinkedList<>();
		s.add(57);
		
		s.add(67);
		s.add(56);
		s.add(78);
		s.add(90);
		System.out.println(".....for loop......");
		for(int i=0;i<=s.size();i++)
		{
			System.out.println(s.get(i));
		}
		System.out.println(".......for each loop....");
		for(int k:s)
		{
			System.out.println(k);
		}
		System.out.println(".......iterator....");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
	
	}

}
