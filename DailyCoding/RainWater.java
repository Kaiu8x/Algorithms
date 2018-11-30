/*
You are given an array of non-negative integers that
represents atwo-dimensional elevation map where each
element is unit-width wall and the integer is the height.
Suppose it will rain and all spots between two walls get
filled up.

Compute how many units of water remain trapped on the map
in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit
of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in
the first index, 2 in the second, and 3 in the fourth index
(we cannot hold 5 since it would run off to the left), so we
can trap 8 units of water.
[3, 0, 1, 3, 0, 5]
[|, 3, 2, |, 3, |] = 8

[5, 1, 2, 3, 4, 5]
[|, 4, 3, 2, 1, |] = 10

[0, 1, 2, 3, 4, 5]
[0, 0, 0, 0, 0, |] = 0

[5, 4, 3, 2, 1, 0]
[|, 0, 0, 0, 0, 0] = 0

[5, 2, 2, 4, 1, 4]
[|, 2, 2, |, 3, |] = 7

[5, 2, 2, 4, 1, 5]
[|, 3, 3, 1, 4, |] = 11

[3, 0, 5, 0, 2, 4]
[|, 3, |, 4, 2, |] = 9

[5, 3, 1, 4, 1, 5]
[|, 2, 4, 1, 4, |] = 11

[1, 2, 5, 3, 1, 8, 0, 6]
[0, 0, |, 2, 4, |, 6, |] = 12

-compare to know if the next one is less the actual,
 creae a flag and change the comparison. then you know 'V' shapes. 
-


*/

import java.util.*;

public class RainWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		//int max = 0;
		for (int i = 0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		//for (Integer x: arr) {
		//	System.out.println(x);
		//}
		System.out.println("result: "+ trappedWater(arr));
	}

	// [3, 0, 1, 3, 0, 5]


	public static int trappedWater(int[] arr) {
		int result = 0;

		//left Pointer
		int leftIndex = 0;
		int leftWall = 0;

		//right Pointer
		int rightIndex = arr.length - 1;
		int rightWall = 0;

		while(leftIndex <= rightIndex) {
			int leftHeight = arr[leftIndex];
			int rightHeight = arr[rightIndex];
			int currentMinHeight = 0;
			if(leftHeight >= leftWall) {
				leftWall = leftHeight;
				leftIndex++;
			} else if(rightHeight >= rightWall) {
				rightWall = rightHeight;
				rightIndex--;
			} else {
				currentMinHeight = Math.min(leftWall, rightWall);
				if(leftWall <= rightWall) {
					result += currentMinHeight - leftHeight;
					leftIndex++;
				} else {
					result += currentMinHeight - rightHeight;
					rightIndex--;
				}
			}
			System.out.printf("Current index| leftIndex %d rightIndex %d \n",leftIndex,rightIndex);
			System.out.printf("Current wall| leftWall %d rightWall %d\n", leftWall, rightWall);
			System.out.printf("CurrentHeight| leftHeight %d rightHeight %d currentMinHeight %d \n", leftHeight, rightHeight, currentMinHeight);
			System.out.printf("Result: %d\n\n", result);
		}

		return result;
	}
}























