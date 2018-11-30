import java.util.*;

public class SwapRGB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		//int arrSize = sc.nextInt();
		//char[] arr = new char[arrSize];
		//for (int i = 0; i<arrSize; i++) {
		//	arr[i] = sc.nextChar();
		//}
		char[] arr = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		System.out.print("[ ");
		for (Character x: arr) {
			System.out.print(x+", ");
		}
		System.out.print(" ]\n");

		char[] res = swapRGBOrder(arr);
		System.out.print("[ ");
		for (Character x: res) {
			System.out.print(x+", ");
		}
		System.out.print(" ]\n");
		
	}


	public static char[] swapRGBOrder(char[] arr) {
		int indx = 0;
		char aux;
		char[] res = arr;
		for (int i = 0; i<res.length;i++) {
			if(res[i] == 'R') {
				aux = res[indx];
				res[indx] = res[i];
				res[i] = aux;
				indx++;
			}
		}

		for(int j = indx; j<arr.length; j++) {
			if(res[j] == 'G') {
				aux = res[indx];
				res[indx] = res[j];
				res[j] = aux;
				indx++;
			}
		}
		return res;
	}
}