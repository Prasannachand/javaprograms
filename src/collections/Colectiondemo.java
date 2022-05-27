package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Colectiondemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList  al=new ArrayList();
		al.add(100);
		al.add("morning");
		al.add(200);
		al.add("evening");
		al.add(300);
		al.add("night");
		System.out.println("elements of the list");
		//for(int i=0;i<=al.size();i++)
		System.out.println(" after adding the element");
		al.add("hello");
		System.out.println(al);
		System.out.println("after adding the elements with index value");
			//System.out.println(al);
			al.add(2, " afternoon");
			System.out.println(al);
			
			al.remove(1);
			System.out.println("after removing the  elements");
			al.size();
			System.out.println(al.contains("hello"));
			System.out.println(al);
			
			System.out.println(	al.size());
		      al.set(1,200);
		      System.out.println(al);
		      al.get(4);
		      System.out.println(al.get(4));
		      System.out.println(("reading elements from for loop"));
		      for(int i=0;i<al.size();i++)
		      {
		    	  System.out.println(al.get(i));
		      }
		      System.out.println("reading elements from for each loop");
		      for(Object l:al )
		      {
		    	  System.out.println(l);
		      }
		      
		      System.out.println("reading elements from iterator");
		      Iterator it=al. iterator();
		      while(it.hasNext())
		      {
		    	  System.out.println(it.next());
		      }
		      ArrayList s=new ArrayList();
		      s.add('a');
		      s.add('e');
		      
		      s.add('i');
		      s.add('o');
		      s.add('u');
		      
		  System.out.println(s);
		  

		   s.addAll(al);  
		      
		   System.out.println(s);
		   System.out.println(al.isEmpty());
		 //  Collections.sort(s);
		 //  System.out.println("elements after sorting"+s);
		     
		      
		
			
		  
		

	}

}
