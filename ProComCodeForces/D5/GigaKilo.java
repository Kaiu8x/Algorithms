import java.util.*;
public class GigaKilo {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		long[] powerTwo = new long[4000000];
		powerTwo[1] = 1;
		for(int i = 2; i<4000000; i++) {
			powerTwo[i] = (powerTwo[i-1]*2)%1000000007;
		}

		for(int i = 0; i<n; i++) {
			x = sc.nextInt();
			System.out.println(powerTwo[x/3]);
		}
	}
}
//15
//3
//6
//9
//12
//15
//24
//27
//39
//60
//78
//90
//102
//3102
//3333
//333333

