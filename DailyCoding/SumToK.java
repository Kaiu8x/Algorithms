/*Given a list of numbers and a number k, return whether any two numbers
from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true
since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Resourses:
    -https://infotechgems.blogspot.com/2011/11/java-collections-performance-time.html
*/

import java.util.*;


public class SumToK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		//int max = 0;
		for (int i = 0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
		//for (Integer x: arr) {
		//	System.out.println(x);
		//}
		System.out.println("result: "+ findSumToK(arr, k));
	}


	public static boolean findSumToK(int[] arr, int k) {
		boolean result = false;
        
        //O(n^2) time O(1) space solution
        //for(int i = 0; i<arr.length; i++) {
        //int tofind = k - arr[i];
        //    for(int j = i+1; j<arr.length; j++) {
        //        if(arr[j] == tofind) {
        //            System.out.printf("num1: %d num2: %d k: %d \n",arr[i], arr[j], k);
        //            result = true;
        //            break;
        //        }
        //    }
        //}

        //O(n) time O(n) space solution
        HashSet<Integer> toFindSet = new HashSet<>();
        toFindSet.add(k-arr[0]);
        for(int i = 1; i<arr.length; i++) {
            if(toFindSet.contains(arr[i])) {
                result = true;
                //System.out.printf("num1: %d num2: %d k: %d \n",arr[i], arr[i], k);
                break;
            } else {
                toFindSet.add(k-arr[i]);
            }
        }

		return result;
	}
}