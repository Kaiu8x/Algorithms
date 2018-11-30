import java.util.*;
public class diegoDrinks {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] f1 = new int[n];
		int[] f2 = new int[n];
		for (int i = 0;i<n ;i++ ) {
			f1[i] = sc.nextInt();
			f2[i] = sc.nextInt();
			int ans = f1[i]+1;
			int tmp = ((f1[i]+1)*(f1[i]))/2;
			
			if (tmp<f2[i]) {
				f2[i] = f2[i]-tmp;
				
				if (f2[i]%f1[i] == 0) {
					ans += (f2[i]/f1[i]);
				
					System.out.println(ans);
				}else{
					System.out.println("Too drunk to count ");
				}
				
			}else if (tmp == f2[i]) {
				System.out.println(ans);
			}else{
				System.out.println("Too drunk to count");
			}
		}
	}
}