import java.util.*;
public class KadaneAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numQ = sc.nextInt();
		int arrLen = 0;
		for(int i = 0; i<numQ; i++) {
			arrLen = sc.nextInt();
			int[] arr = new int[arrLen];
			//int sumArr = 0;
			for (int j = 0; j<arrLen; j++) {
				arr[j] = sc.nextInt();
				//sumArr += arr[j];
			}
			System.out.println(checkMaxSubStr(arr));
		}
	}

	public static int checkMaxSubStr(int[] arr) {
		int max = arr[0];
		int currentSum = 0;
		for(int i = 0; i<arr.length; i++) {
			currentSum = arr[i];
			if(currentSum > max) {
				max = currentSum;
			}
			for(int j = i+1; j<arr.length-i; j++) {
				currentSum += arr[j];
				if(currentSum > max) {
					max = currentSum;
				}
				System.out.println("currentSum: "+currentSum);
				System.out.println("currentMax: "+ max);
				System.out.println();
			}
		}
		return max;
	}
}

//[10, -3, -7, 20, -10, 9]
