package arraylist;

import java.util.ArrayList;

public class Demo7 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(11);
	al.add(17);
	al.add(13);
	al.add(19);
	al.add(15);
	
	for (int i = 0; i < al.size(); i++) {
    int c=0;
		for (int j = 2; j <al.get(i)/2; j++) {
			if (al.get(i)%j==0) {
				c++;
			}
		}
		if (c==0) {
			System.out.println(al.get(i));
		}
	}
  







































































































































































































































































































































































































































































































































































































































































































}
}
