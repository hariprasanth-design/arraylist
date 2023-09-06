package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo3 {
public static void main(String[] args) {
	Object[] a= {10,20,30,50};
	for(Object i:a)
	{
		System.out.println(i);
	}
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(null);
	a1.add("Hi");
	a1.add(true);
	for(Object j:a1)
	{
		System.out.println(j);
	}
	
//	Iterator i = a1.iterator();
//	while (i.hasNext()) {
//		
//		System.out.println(i.next());
//		a1.add(10);
//	}
//	System.out.println();
	
	ListIterator i = a1.listIterator(a1.size());
	while (i.hasPrevious()) {
		a1.add(10);
		System.out.println(i.previous());
	}
	
	
}
}
