import java.util.*;
public class ProductofOtherIndex {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//[120, 60, 40, 30, 24]
		int[] resArr = multiplyOfIndex(arr);
		int[] resArr2 = multiplyOfIndexNoDiv(arr);

		System.out.print("[ ");
		for(int i: resArr) {
			System.out.printf("%d, ",i);
		}
		System.out.print("]\n");

		System.out.print("[ ");
		for(int j: resArr2) {
			System.out.printf("%d, ",j);
		}
		System.out.print("]\n");
	}

	public static int[] multiplyOfIndex(int[] arr) {
		int[] resArr = new int[arr.length];
		int max = 1;
		for(int m : arr) {
			max *= m;
		}
		for(int i = 0; i<resArr.length; i++) {
			resArr[i] = max/arr[i];
		}
		return resArr;
	}

	public static int[] multiplyOfIndexNoDiv(int[] arr) {
		int[] resArr = new int[arr.length];

		for (int i = 0; i<resArr.length; i++) {
			resArr[i] = 1;
			for (int j = 0; j<resArr.length; j++) {
				if(i != j) {
					resArr[i] *= arr[j];
				}
			}
		}
		return resArr;
	}

}