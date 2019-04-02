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

#include <iostream>

using namespace std;

int main() {
	int n, m;
	cout << "entern size of n and m";
	cin >> n >> m;

	int matrix[n][m];

	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < m; ++j) {
			cin >> matrix[i][j];
			cout << matrix[i][j];
		}
	}

	int res = largestArea(matrix);

	cout << "the largest area of the matrix is: " << res << endl;
	return 0;
}

int largestArea(int matrix[][]) {
	int maxArea = 0;

	return maxArea;
}