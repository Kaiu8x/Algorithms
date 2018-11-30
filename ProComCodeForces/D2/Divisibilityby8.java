import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class Divisibilityby8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = Integer.toString(n);

		/*if(str.length()<4) {
			if(n%8 == 0){
				System.out.println("YES");
				System.out.println(n);
			} else {
				System.out.println("NO");
			}
		}*/

		int [] arr = new int[str.length()];
		int temp = 0;
		boolean flag = false;
		int fl = 0;
		int lastPlace = str.length()-3;

		StringBuilder strb = new StringBuilder();

		for(int i = str.length()-1; i>=0; i--) {
			
			if(!flag) {
				if(str.charAt(i) == '2' || str.charAt(i) == '6') {
					lastPlace = i;
					fl = 2;
					flag = true;
					break;
				} else {
					if(str.charAt(i) == '4' || str.charAt(i) == '8' || str.charAt(i) == '0') {
						lastPlace = i;
						fl = 4;
						flag = true;
						break;
					}
				}
			}

		}
		int k;

		int secondlPlace = lastPlace;

		if(fl != 0){
			for(int i = lastPlace-1; i>=0; i--) {
				k = Character.getNumericValue(str.charAt(i));
				if(fl == 2) {
					
					if(k%2 != 0){
						secondlPlace = i;
						break;
					}
				}

				if(fl == 4) {
					if(k%2 == 0){
						secondlPlace = i;
						break;
					}
				}

			}
		}

		if(fl != 0 && flag) {
			strb.append(str.substring(0,secondlPlace+1));
			strb.append(str.charAt(lastPlace));
			System.out.println("YES");
			System.out.println(strb);
		} else {
			System.out.println("NO");
		}

		

	}

	
}















