package collections;

import java.util.HashMap;
import java.util.Map;

public class Oops {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "inheritance");
		hm.put(2, "polymorphism");
		hm.put(3, "encapsulation");
		hm.put(4, "abstraction");
		hm.put(5, "interface");
		System.out.println("elements in hash map...."+hm.entrySet());
		hm.put(6," super");
		System.out.println("keys......." +hm.keySet());
		hm.replace(4, "overloading");
		
		System.out.println(hm);
		System.out.println("values....."+hm.values());
		
		HashMap<String,Integer> hm1=new HashMap<>();
		hm1.put( "inheritance" ,1);
		hm1.put( "polymorphism",2);
		hm1.put("encapsulation",3);
		hm1.put("abstraction",4);
		System.out.println(hm1.entrySet());
		String val=hm.get(1);
		System.out.println("displaying value "+val);
		//hm.putAll(hm1);
	for(Integer i:hm.keySet())
	{
		System.out.print(i);
		//System.out.print(", ");
		System.out.println();
			
			
		}
		for(String c:hm.values())
		{
			System.out.print(c);
			//System.out.print(", ");
			System.out.println();
			
		}
		//hm.putAll(hm1);
		for(String j:hm1.keySet())
		{
			System.out.print(j);
			//System.out.print(", ");
			System.out.println();
		}
		for(String k:hm1.keySet())
		{
			System.out.print(k);
			//System.out.print(", ");
			System.out.println();
		}
		HashMap<Integer,String>  h=new HashMap<>();
		h.put(6,"monday");
		h.put(7, "tuesday");
		h.put(8,"wednesday");
		h.put(1, "thursday");
		hm.putAll(h);
		System.out.println(hm);
		System.out.println(h.containsKey(3));
		
	
		System.out.println(h.containsValue("monday"));
		
		System.out.println(h.containsValue("c"));
		System.out.println(h.size());
		System.out.println(hm.size());
		System.out.println(hm1.size());
			
		System.out.println(hm1.isEmpty());
		
		//System.out.println(hm1.clear());
		//entry methods
		for(Map.Entry e:h.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		
		

	}

}
