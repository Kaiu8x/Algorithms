#include <iostream>
using namespace std;

int main () {
	int numInput;
	int numFact;
	cout << "Enter how many facotrials";
	cin >> numInput;
	long double dp[100001];
	dp[1] = 1;

	for (int i = 2; i < 100001; ++i) {
		dp[i] = dp[i-1]*i;
	}
	for (int i = 0; i < numInput; ++i) {
		cin >> numFact;
		cout << "factorial of " << numFact << " is " << dp[numFact]  << "\n";
	}
	return 0;
}