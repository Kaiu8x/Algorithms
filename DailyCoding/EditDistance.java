/*
The edit distance between two strings refers to the minimum number of character insertions,
deletions, and substitutions required to change one string to the other. For example, the
edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”,
substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.

saturday
kday

sunday
*/

import java.util.*;

public class EditDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s1 = sc.next();
		String s2 = sc.next();

		System.out.printf("Edit distance between %s and %s is %d\n",s1, s2,editDistance(s1,s2));
	}

	public static int editDistance(String s1, String s2) {
		int distance = 0;
		char[] s1CharArr = s1.toCharArray();
		char[] s2CharArr = s2.toCharArray();
		char[] resultString;
		boolean s1IsBigger = false;
		int s1Pointer = 0;
		int s2Pointer = 0;
		if(s1CharArr.length >= s2CharArr.length) {
			resultString = new char[s1CharArr.length];
			s1IsBigger = true;
		} else {
			resultString = new char[s2CharArr.length];
		}

		if(s1IsBigger) {
			for(int i = 0; i<s2CharArr.length; i++) {
				while(s1Pointer<s1CharArr.length) {
					if(s2CharArr[i] == s1CharArr[s1Pointer]) {
						break;
					}
					s1Pointer++;
				}
				if(s1Pointer != s1CharArr.length) {
					resultString[s1Pointer] = s2CharArr[i];
					s1Pointer++;
				} else {
					s1Pointer = 0;
				}
			}
		} else {
			for(int i = 0; i<s1CharArr.length; i++) {
				while(s2Pointer<s2CharArr.length) {
					if(s1CharArr[i] == s2CharArr[s2Pointer]) {
						break;
					}
					s2Pointer++;
				}
				if(s2Pointer != s2CharArr.length) {
					resultString[s2Pointer] = s1CharArr[i];
					s2Pointer++;
				} else {
					s2Pointer = 0;
				}
			}
		}
		

		System.out.print("[ ");
		for(char c : resultString) {
			
			if(c == '\u0000') {
				distance++;
				System.out.print("_ ");
			} else {
				System.out.print(c+" ");
			}
		}
		System.out.print(" ]\n");

		return distance;
	}
}

/*
recursive option: https://www.geeksforgeeks.org/edit-distance-dp-5/
static int editDistDP(String str1, String str2, int m, int n) 
    { 
        // Create a table to store results of subproblems 
        int dp[][] = new int[m+1][n+1]; 
       
        // Fill d[][] in bottom up manner 
        for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 
                // If first string is empty, only option is to 
                // isnert all characters of second string 
                if (i==0) 
                    dp[i][j] = j;  // Min. operations = j 
       
                // If second string is empty, only option is to 
                // remove all characters of second string 
                else if (j==0) 
                    dp[i][j] = i; // Min. operations = i 
       
                // If last characters are same, ignore last char 
                // and recur for remaining string 
                else if (str1.charAt(i-1) == str2.charAt(j-1)) 
                    dp[i][j] = dp[i-1][j-1]; 
       
                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    dp[i][j] = 1 + min(dp[i][j-1],  // Insert 
                                       dp[i-1][j],  // Remove 
                                       dp[i-1][j-1]); // Replace 
            } 
        } 
   
        return dp[m][n]; 
    } 
*/


















