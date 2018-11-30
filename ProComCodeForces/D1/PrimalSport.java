import java.util.*;

public class PrimalSport {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x2 = sc.nextInt();

		long result = 0;

		long lf = largestPrimeFactor(x2);
		
		for(int i = x2-lf+1; i<=x2; i++) {

		}

		System.out.println(result);

	}

	/*public static long largestPrimeFactor(long n) {
		long maxPrime = -1;

		while(n % 2 == 0) {
			maxPrime = 2;

			n >>= 1;
		}

		for(int i = 3; i<=Math.sqrt(n); i += 2) {
			while (n%i == 0) {
				maxPrime = i;
				n = n/i;
			}
		}


		if(n>2)
			maxPrime = n;

		return maxPrime;
	}*/

	public static int largestPrimeFactor(long number) {
		int i;

		for(i = 2; i<= number; i++) {
			if(number%i == 0){
				number = number/i;
				i--;
			}
		}

		return i;
	}

	
}














