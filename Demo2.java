package arraylist;

import java.util.ArrayList;

public class Demo2 {
public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add(30);
	al1.add(40);
	al1.add(1);
	al1.add(60);
	System.out.println("Arraylist 1 : "+al1);
	ArrayList al2=new ArrayList();
	al2.add(true);
	al2.add(null);
	al2.add("Hi");
	System.out.println("ArrayList 2 : "+al2);
	al2.add(1, al1);
	System.out.println(al2);
	al1.addAll(3,al2);
	System.out.println(al1);
	//To remove ELement in a Collection
	al1.retainAll(al2);
	System.out.println(al1);
	
	
}
}
