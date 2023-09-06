package arraylist;

import java.util.Arrays;

public class LargestSumOfAnyTwoElement {
public static void main(String[] args) {
	int a[]= {1,3,10,42,2,5,6};
	int sum=0;
	int[] b=new int[a.length];
	for (int i = 0; i < a.length; i++) {

		for (int j = 0; j < a.length; j++) {
			if (sum<=a[i]+a[j] && i!=j) {
				sum=a[i]+a[j];
				
			}
			b[i]=sum;
		}
		sum=0;
	}
	System.out.println(Arrays.toString(b));
}
}
