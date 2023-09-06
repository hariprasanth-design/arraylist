package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(40);
	al.add(1);

	Collections.sort(al);
	
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
	System.out.println("========================");
	Collections.reverse(al);
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
}
}
