package arraylist;

import java.util.ArrayList;

public class Demo11 {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList();
	al1.add(10);
	al1.add(20);
	ArrayList<Integer> al2 = new ArrayList();
	al2.add(3);
	al2.add(4);
	ArrayList<Integer> al3=new ArrayList();
	
	int i=0;
	int j=0;
	int k=0;
	
	while (al1.get(i)<al1.size() && al2.get(i)<al2.size()) {
		if (al1.get(i) < al2.get(j)) {
			al3.add(al1.get(i));
			i++;
		} else {
       al3.add(al2.get(j));
		}
		k++;
	}
	System.out.println(al3);
}
}
