import java.util.*;
public class jonOrbs{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] p = new int[q];
		long eps = 1/10000000;
		int n = 1004;
		for (int i = 0;i < q ;i++ ) {
			p[i] = sc.nextInt();
		}
		double[] prob = new double[n];
		int[] ans = new int[n];
		prob[0] = 1;
		for (int i = 1,m = 1;m<=1000 ;i++ ) {
			for (int j = k;j>0 ;j-- ) {
				prob[j] = (j * prob[j] + (k-j+1) * prob[j-1])/k;
			}
			while(m<= 1000 && 2000*prob[k] >= (m-eps)){
				ans[m] = i;
				m++;
			}
			prob[0] = 0;
		}
		for (int i = 0;i < p.length ;i++ ) {
			System.out.println(ans[p[i]]);
		}
	}
}