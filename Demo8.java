package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo8 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	al.add(6);
	al.add(7);
	
Iterator<Integer> l = al.iterator();
while (l.hasNext()) {
	if (l.next()<=5) {
		l.remove();
	}
}
System.out.println(al);


}
}
