// Given an N by M matrix consisting only of 1's
// and 0's, find the largest rectangle containing
// only 1's and return its area.
// 
// For example, given the following matrix:
// 
// [[1, 0, 0, 0],
//  [1, 0, 1, 1],
//  [1, 0, 1, 1],
//  [0, 1, 0, 0]]
// Return 4.
import java.util.*;

public class AreaOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;

		System.out.println("Dimentios of the array?");
		n = Integer.parseInt(sc.nextLine());
		m = Integer.parseInt(sc.nextLine());

		int[][] matrix = new int[n][m];

		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				matrix[i][j] = Integer.parseInt(sc.nextLine());;					
			}
		}

		System.out.println(largestArea(matrix));	
	}

	static int largestArea(int[][] matrix) {
		int result = 0;

		return result;
	}
}