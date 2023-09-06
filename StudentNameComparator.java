package arraylist;

import java.io.Serializable;
import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>,Serializable
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
