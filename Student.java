package arraylist;

import java.io.Serializable;
import java.util.Comparator;

final public class Student implements Serializable {
String name;
int id;
Student() {	
}

Student(String name,int id)
{
	this.name=name;
	this.id=id;
}

@Override
	public String toString() {
		System.out.println("Name" + name);
		System.out.println("Id "+id);
		return " ";
	}




}
