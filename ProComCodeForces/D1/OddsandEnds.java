import java.util.*;

public class OddsandEnds {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		boolean fail = false, open = false;
		int c = 1;
		int n = sc.nextInt();
		int[] in = new int[n];
		boolean[] odd = new boolean[n];
		
		for (int i = 0;i<n ;i++ ) {
			in[i] = sc.nextInt();
			if ((in[i]%2)>0){
				odd[i] = true;
			}else{
				odd[i] = false;
			}
			if (!odd[i]) {
				open = true;
			}
			if(open){
				c++;
				if (odd[i]&&((c%2)>0)) {
					open = false;
				}
			}
		}
	if(n%2 > 0){
		if (open){
			fail = true;
		}
		if(odd[0]&&odd[n-1]){
			fail = false;
		}
		if((odd[0] == false)||(odd[n-1] == false)){
			fail = true;
		}
	}else{
		fail = true;
	}

		if(fail){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}