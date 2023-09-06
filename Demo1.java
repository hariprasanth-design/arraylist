package arraylist;

import java.util.ArrayList;

public class Demo1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(new Object());
	al.add(new String());
	al.add(null);
	al.add(true);
	al.add("Sheela");
	al.add(40);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al);
	System.out.println("===================================");
	ArrayList al1=new ArrayList();
	System.out.println(al1.add(al));
	al1.add("Book");
	al1.add("Pen");
	System.out.println(al1);
	al1.addAll(al);
	System.out.println(al1);
	al1.add(3, 20);
	System.out.println(al1);
al.retainAll(al1);
al1.retainAll(al);
System.out.println(al1);
}
}
