package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class toStorethePrimeNumber {
public static void main(String[] args) {
ArrayList res = primeNumber();
System.out.println(res);

	
}
public static ArrayList primeNumber()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the starting range");
	int m=s.nextInt();
	System.out.println("Enter the ending range");
	int n=s.nextInt();
	ArrayList a=new ArrayList();
	for (int i = m; i <= n; i++) {
		int count=0;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				count++;
			}
		}
		if (count==0) {
			a.add(i);
		}
	}

	return a;

}
}
