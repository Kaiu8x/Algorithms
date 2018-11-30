import java.util.*;
public class dna{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int MOD = 1000000007;
		int n = sc.nextInt();
		sc.nextLine();
		String in = sc.nextLine();
		long ans = 1;
		long max = 0;
		long c = 0;

		char[] ch = in.toCharArray();
		int[] gatc = new int[4];
			for (int i = 0;i<n ;i++ ) {
			
				if(ch[i] == 'G'){
					gatc[0]++;
				}else if(ch[i] == 'A'){
					gatc[1]++;
				}else if(ch[i] == 'T'){
					gatc[2]++;
				}else if(ch[i] == 'C'){
					gatc[3]++;
				}
			}
			for (int i = 0;i<4 ;i++ ) {
				max = Math.max(max,gatc[i]);
			}
			for (int i = 0;i<4 ;i++ ) {
				if (gatc[i] == max) {
					c++;
				}
			}
			while(n>0){
				if (n%2 == 1) {
					ans = ans*c % MOD;					
				}
				c = c*c%MOD;
				n = n/2;
			}
			System.out.println(ans);
			//System.out.println(""+calc(ans,n,MOD));


	}
	/*public static long calc(int base, int exponent, int p) {
		if (exponent == 0) return 1;
		if (exponent == 1) return base % p;
		long m = calc(base, exponent >> 1, p);
		if (exponent % 2 == 0) return (m * m) % p;
		return 1l * base * m  % p * m % p;
	}*/
}