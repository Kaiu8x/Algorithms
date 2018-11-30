import java.util.*;
public class ABC {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		long[][] fraction = new long[3][2];
		long numer = 0;
		String fract = "";
		long lcm = 0;
		long gcd = 0;
		for(int k = 0; k <m ; k++) {
			for(int i = 0; i<3; i++) {
				fract = sc.next();
				//System.out.println(fract);
				String[] kfract = fract.split("/");
				fraction[i][0] = Long.parseLong(kfract[0]);
				fraction[i][1] = Long.parseLong(kfract[1]);
			}
			lcm = lcm(fraction[0][1],fraction[1][1]);
			lcm = lcm(lcm,fraction[2][1]);
			for(int j = 0; j<3; j++) {
				numer += (lcm/fraction[j][1])*fraction[j][0];
			}
			gcd = gcd(numer,lcm);
			numer = numer/gcd;
			lcm = lcm/gcd;
			System.out.println(numer+"/"+lcm);
			numer = 0;

		}
	}

	static long gcd(long a, long b) {
		if(a == 0) return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return (a*b) / gcd(a,b);
	}

}