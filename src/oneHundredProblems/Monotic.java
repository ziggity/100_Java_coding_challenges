package oneHundredProblems;
/*
 * Share
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true
 */
class MonotonicArray {
	
	// *****Approach 1*****
	static boolean breaksDirection(int direction, int curr, int next) {
		int diff = next - curr;
		if (direction > 0)
			return diff < 0;
		else
			return diff > 0;
	}

	static boolean isMonotonic1(int []a, int n) {
		if (n == 2)
			return true;
		int direction = a[1] - a[0];
		for (int i = 2; i < n - 1; i++) {
			if (direction == 0) {
				direction = a[i + 1] - a[i];
				continue;
			}
			if (breaksDirection(direction, a[i], a[i + 1]))
				return false;
		}
		return true;
	}

	//  ***** Approach 2*****
	static boolean isMonotonic2(int []a, int n) {
		if (n == 2)
			return true;

		boolean isInc = true, isDec = true;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] < a[i + 1]) {
				isDec = false;
			} else if (a[i] > a[i + 1]) {
				isInc = false;
			}
		}
		return isDec || isInc;

	}


	public static void main(String[] args) {
		int n = 5;
		int []arr = {2, 3, 4, 4, 5};
		System.out.println(isMonotonic1(arr, n));

	}
}
