import java.util.*;
import java.lang.*;
public class FunctionsAgain{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long[] narr = new long[n-1];
		arr[0] = sc.nextLong();
		for(int i = 1; i<arr.length; i++) {
			arr[i] = sc.nextLong();
			narr[i-1] = Math.abs(arr[i-1] - arr[i]);
		}

		long max = 0;
		long temp = 0;

		for(int i = 0; i<narr.length; i++) {
			for(int j = i; j<narr.length; j++) {
				if((j-i)%2 == 0)
					temp += narr[j];
				else
					temp -= narr[j];
				if(temp>max) {
					max = temp;
				}
			}
			temp = 0;
		}

		System.out.println(max);
	}
}


/*[1,4,2,3,1]
(0,5)
abs(a[0]-a[1])*(-1)^(i-1) + abs(a[1]-a[2])*(-1)^(i-1)
+ abs(a[2]-a[3])*(-1)^(i-1) + abs(a[3]-a[4])*(-1)^(i-1)

(0,4)
abs(a[0]-a[1])*(-1)^(i-1) + abs(a[1]-a[2])*(-1)^(i-1)
+ abs(a[2]-a[3])*(-1)^(i-1)
*/