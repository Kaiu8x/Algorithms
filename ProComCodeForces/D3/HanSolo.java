import java.util.*;
public class HanSolo {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nx = sc.nextInt();
		int ny = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double med1 = 0;
		double med2 = 0;
		int count = 0;
		Set<Integer> m = new HashSet<Integer>();
		for (int i = 0;i<n ;i++ ) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
			x[i] = x[i]-nx;
			y[i] = y[i]-ny;
		}
		for (int i = 0;i<n-1 ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				med1 = 10*y[j]*x[i];
				med2 = 10*y[i]*x[j];
				
				if (med1 == med2) {
					m.add(count);
				}
			}
			count++;
		}
		System.out.println((n-m.size())+"");
	}
}