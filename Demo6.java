package arraylist;

import java.util.ArrayList;

public class Demo6 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(91);
	al.add(15);
	al.add(10);
	al.add(2);
	al.add(13);
	
	for (int i = 0; i < al.size(); i++) {
		if (al.get(i)%2==0) {
			System.out.println(al.get(i));
		}
	}
}
}
