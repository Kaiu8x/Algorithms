import java.util.*;

public class Kyoya {
  
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		long[][] comb = new long[1010][1010];
		comb[0][0] = 1;
		for (int i = 1; i < 1010; i++) {
			comb[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				comb[i][j] = (comb[i-1][j] + comb[i-1][j-1]) % 1000000007;
			}
		}
		
		int K = in.nextInt();
		int[] color = new int[K];
		for (int i = 0; i < K; i++) color[i] = in.nextInt();
		
		long res = 1;
		int total = 0;
		for (int i = 0; i < K; i++) {
			res = (res * comb[total + color[i] - 1][color[i] - 1]) % 1000000007;
			total += color[i];
		}
		
		System.out.println(res);
  }
}