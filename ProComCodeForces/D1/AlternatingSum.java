import java.util.*;
import java.lang.*;

public class AlternatingSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextLong();
		double a = sc.nextLong();
		double b = sc.nextLong();
		double k = sc.nextLong();
		double res = 0;
		double temp = 0;

		int[] signed = new int[(int)k];

		String s = sc.next();
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='-'){
				signed[i] = -1;
			} else {
				signed[i] = 1;
			}
		}

		for(int i = 0; i<=(n+1)/k-1; i++) {
			for(int j = 0; j<=(k-1); j++) {
				double x = signed[j%s.length()];
				double y = Math.pow(a, n-j);
				double z = Math.pow(b,j);
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println();
				temp += x*y*z;
				System.out.println(temp);
				System.out.println();
			}
			double m = Math.pow((b/a),k);
			double nm = Math.pow(m,i);
			System.out.println(m);
			System.out.println(nm);
			System.out.println();
			res = temp*nm;
			System.out.println(res);
			System.out.println();
		}
		System.out.println(res);
		System.out.println((long)res%100000009);
	}

	
}















