package collections;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList<Studentdata> s=new LinkedList<Studentdata>();
		Studentdata sd1=new Studentdata(1,"prasanna",89,'A');
		Studentdata sd2=new Studentdata(2,"chandu",90,'A');
		Studentdata sd3=new Studentdata(3,"mokshitha",76,'B');
		Studentdata sd4=new Studentdata(4,"ruthvick",71,'B');
		Studentdata sd5=new Studentdata(5,"sai",66,'c');
		s.add(sd1);
		s.add(sd2);
		s.add(sd3);
		s.add(sd4);
		s.add(sd5);
		
		for(Studentdata j:s)
			
		{
			System.out.println(j.rollno+" ,"+j.name+" ,"+j.marks+", "+j.grade);
			//.out.println( + ", " +sd2.name+ " ,"+sd3.marks+" ,"+sd4.grade);
		}

	}

}
