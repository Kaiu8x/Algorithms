import java.util.*;
public class functions{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		long ans = 0;
		for (int i = 1;i<=n ;i++ ) {
			a[i] = sc.nextInt();
		}
		long[] b = new long[n+1];
		long odd = 0;
		long even = 0;
		long s1 = 0;
		long s2 = 0;
		for (int i = 0;i < n ;i++ ) {
			b[i] = Math.abs(a[i]-a[i+1]);
		}
		for (int i = n-1;i >= 1; i--) {
			if (i%2 == 0) {
				even = even+b[i];
			}else{
				odd = odd+b[i];
			}
			if (i%2 == 0) {
				ans = Math.max(ans,even-odd-s1);
			}else{
				ans = Math.max(ans, odd-even-s2);
			}
			s1 = Math.min(s1,even-odd);
			s2 = Math.min(s2,odd-even);
		}
		System.out.println(ans);



	}
}