import java.util.*;
public class mpt {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String fract = "";
		int gcd = 0;
		int denom = 1;
		int numer = 0;
		for(int k = 0; k <m ; k++) {
			fract = sc.next();
			if(fract.length() == 1 && fract.contains("1")) {
				System.out.println("1");
				continue;
			} else {
				if(fract.length() == 1 && fract.contains("0")) {
					System.out.println("-1");
					continue;
				} 
			}
			String[] kfract = fract.split("\\.");
			//denom = Math.pow(10,kfract[1].length()+1);
			for(int i = 0; i<kfract[1].length(); i++) {
				denom *= 10;
			}
			numer = Integer.parseInt(kfract[1]);
			//System.out.println(numer);
			//System.out.println(denom);
			//if(numer == 0) {
			//	System.out.println("-1");
			//	continue;
			//}
			gcd = gcd(numer,denom);
			System.out.println(denom/gcd);
			numer = 0;
			denom = 1;
		}

	}

	static int gcd(int a, int b) {
		//if(a < b){
		//	int tmp = a;
		//	a = b;
		//	b = tmp;
		//}
		if(a == 0) return b;
		return gcd(b % a, a);
	}

	//static int gcd (int a, int b) {
	//	int r, i;
	//	while(b!=0) {
	//		r = a%b;
	//		a = b;
	//		b = r;
	//	}
	//	return a;
	//}

}