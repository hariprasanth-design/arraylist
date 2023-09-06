package arraylist;

import java.util.ArrayList;

public class LargestSumOfAnyTwoNumber {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(15);
	al.add(9);
	al.add(2);
	al.add(4);
	int sum=0;
	ArrayList<Integer> al1=new ArrayList();
	for (int i = 0; i < al.size(); i++) {
		for (int j = 0; j < al.size(); j++) {
			if (sum<=al.get(i)+al.get(j) && i!=j) {
				sum=al.get(i)+al.get(j);
				al1.add(sum);
			}
		
			
		}
		sum=0;
	}
System.out.println(al1);	
}
}
