import java.util.*;
public class crazyTown{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		double a1,a2;
		int ans = 0;
		for (int i = 0;i<n ;i++ ) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			a1 = (double)((double)a*(double)x1)+((double)b*(double)y1)+(double)c;
			a2 = (double)((double)a*(double)x2)+((double)b*(double)y2)+(double)c;
			//System.out.println("a1 "+a1+"   a2 "+a2+"  sum"+((double)a1*a2));
			if ((double)a1*(double)a2 < 0) {
				//System.out.println("try "+i+"ans "+((a * x1 + b * y1 + c) * (a * x2 + b * y2 + c)));
				ans+=1;
			}

		}
		System.out.println(""+ans);
	}
}