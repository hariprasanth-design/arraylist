package arraylist;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Test {


public static void main(String[] args) throws IOException, ClassNotFoundException {
	ArrayList<Student> s=new ArrayList();
	Student s1=new Student(" Miller ", 1); 
	Student s2=new Student(" Allen  ", 2);
	Student s3=new Student(" Adams   ", 4);
	s.add(s1);
	s.add(s2);
	s.add(s3);
	Collections.sort(s,new StudentNameComparator());
	
	
	FileOutputStream fout = new FileOutputStream("D:\\java\\stu.jpg");
	ObjectOutputStream oin = new ObjectOutputStream(fout);
	oin.writeObject(s);
	oin.flush();
	System.out.println("Serialized");
	
	FileInputStream fin = new FileInputStream("D:\\java\\stu.jpg");
	ObjectInputStream oin1 = new ObjectInputStream(fin);
	System.out.println(oin1.readObject());
   
}
}
