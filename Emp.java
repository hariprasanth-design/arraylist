package arraylist;

public class Emp implements Comparable<Emp>{
String name;
int id;
double sal;
String doj;

Emp(){}
Emp(String name,int id,double sal,String doj)
{
this.name=name;
this.id=id;
this.sal=sal;
this.doj=doj;
}

@Override
	public String toString() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(doj);
		return " ";
	}
@Override

	public int hashCode() {
		int hc=0;
		hc=hc+name.hashCode();
		hc=hc+id;
		hc=(int) (hc+sal);
		hc=hc+doj.hashCode();
		return hc;
	}
public int compareTo(Emp o) {
	
	return this.name.compareTo(o.name);
}
}
