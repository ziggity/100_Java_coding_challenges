package oneHundredProblems;
/*
 * Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:

B.length >= 3
There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
(Note that B could be any subarray of A, including the entire array A.)

Given an array A of integers, return the length of the longest mountain. 

Return 0 if there is no mountain.

Example 1:

Input: [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
Example 2:

Input: [2,2,2]
Output: 0
Explanation: There is no mountain.
Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000
Follow up:

Can you solve it using only one pass?
Can you solve it in O(1) space?
 */
class LongestPeak {

	static int solve(int []a, int n) {
		int longestPeakLength = 0, i = 1;
		while (i < n - 1) {
			if (!(a[i - 1] < a[i] && a[i] > a[i + 1])) { //not a peak
				i++;
				continue;
			}
			int leftIndex = i - 2;
			while (leftIndex >= 0 && a[leftIndex] < a[leftIndex + 1])
				leftIndex--;
			int rightIndex = i + 2;
			while (rightIndex < n && a[rightIndex] < a[rightIndex - 1])
				rightIndex++;
			int currentPeakLength = rightIndex - leftIndex - 1;
			longestPeakLength = Math.max(longestPeakLength, currentPeakLength);
			i = rightIndex;

		}
		return longestPeakLength;
	}

	public static void main(String[] args) {
		int n = 11;
		int []a = {1, 4, 3, 3, 1, 10, 9, 8, 7, 11, 12};
		System.out.println(solve(a, n));
	}
}