package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpTest {
public static void main(String[] args) {
	ArrayList<Emp> al = new ArrayList();
	al.add(new Emp("Miller", 3, 5000, "8 May 1998"));
	al.add(new Emp("King", 1, 3000, "17 june 2000"));
	al.add(new Emp("Adams", 5, 4000, "1 Jan 2003"));
	al.add(new Emp("Allen", 4, 7000, "2 Dec 2005"));
	al.add(new Emp("Smith", 2, 2000, "31 Nov  2010"));
	Collections.sort(al);
	Iterator<Emp> i = al.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		System.out.println("==========================");
	}
}
}
