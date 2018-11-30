import java.util.*;
public class pong {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		int count = 0;
		
		int n = sc.nextInt();
		//int[] x = new int[n+1];
		//int[] y = new int[n+1];
		for (int i = 0;i<n ;i++ ) {
			int ch = sc.nextInt();
			if (ch == 1) {
				x.add(sc.nextInt());
				y.add(sc.nextInt());
				//count++;
				//x[count] = sc.nextInt();
				//y[count] = sc.nextInt();
				
			}else{
				int x1 = sc.nextInt();
				int x2 = sc.nextInt();
				int size = x.size();//count+1;
				boolean[][] ans = new boolean[size][size];
				for (int j = 0;j<size ; j++) {
					for (int k = 0;k<size ;k++ ) {
						int a1 = x.get(k);//x[k];
						int a2 = x.get(j);//x[j];
						int b1 = y.get(k);//y[k];//
						int b2 = y.get(j);//x[j];
						if (a1>a2 && a1<b2 || b1>a2 && b1<b2) {
							ans[k][j] = true;
						}
					}
				}
				for (int j = 0;j<size ;j++ ) {
					for (int k = 0;k<size ;k++ ) {
						for (int l = 0;l<size ;l++ ) {
							ans[k][l] = ans[k][l]||(ans[k][j] && ans[j][l]);
						}
					}
				}
				if (ans[x1-1][x2-1]) {
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}