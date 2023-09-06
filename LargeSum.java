package arraylist;

public class LargeSum {
public static void main(String[] args) {
	int a[]= {1,3,10,42,2,5,6};
	int sum=0;
	int f=0;
	int l=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (sum<a[i]+a[j]) {
				sum=a[i]+a[j];
				f=i;
				l=j;
			}
		}
	}
	System.out.println(sum);
	System.out.println(a[f]);
	System.out.println(a[l]);
}
}
