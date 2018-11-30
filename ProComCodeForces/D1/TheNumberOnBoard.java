import java.util.*;
import java.math.BigInteger;
public class TheNumberOnBoard {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		BigInteger n = sc.nextBigInteger();

		int x = 0;
		//int c;
		
		String str = n.toString();
		int[] nArr = new int[str.length()];
		for (int i = 0;i<nArr.length ;i++ ) {
			nArr[i] = str.charAt(i)-'0';
			x = x+nArr[i];
			//System.out.println(x);
		}
		int ans = 0;
		Arrays.sort(nArr);
		for (int j = 0; j < nArr.length; j++){
			if (x < k){
				
				x += 9 - nArr[j];
				ans  += 1;
				
			}
		}

		System.out.println(""+ans+"");


	}
}