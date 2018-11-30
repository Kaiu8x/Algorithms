import java.util.*;
public class sequences{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int MOD = (int) 1e9 + 7;
		if (y%x == 0) {
			y /= x;
			
			List<Integer> n = new ArrayList<>();
			for (int i = 1; 1l * i * i <= y ;i++ ) {
				if (y%i == 0) {
					n.add(i);
					if (y/i!=i) {
						n.add(y/i);
					}
					
				}
			}
			long[] m = new long[n.size()];
			Collections.sort(n);
			//System.out.println(n);
			for (int i = 0;i<n.size() ;i++ ) {
				int k = n.get(i);
				m[i] = calc(2,k-1,MOD);
				for (int j = 0;j < i ;j++ ) {
					if (k%n.get(j) == 0) {
						m[i]-=m[j];
						if (m[i]<0) {
							m[i] += MOD;
						}
					}
				}
				
			}
			System.out.println(m[n.size()-1]);
		}else{
			System.out.println("0");
		}
	}
	public static long calc(int base, int exponent, int p) {
		if (exponent == 0) return 1;
		if (exponent == 1) return base % p;
		long m = calc(base, exponent >> 1, p);
		if (exponent % 2 == 0) return (m * m) % p;
		return 1l * base * m  % p * m % p;
	}
}