package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList();
	al.add("Hari");
	al.add("Prasanth");
	al.add("Allen");
	al.add("Miller");
	Collections.sort(al);
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
}
}
