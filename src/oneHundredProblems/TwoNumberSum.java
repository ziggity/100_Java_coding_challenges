package oneHundredProblems;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
import java.util.Arrays;
import java.util.HashSet;

class TwoNumberSum {
	static void solve2(int []a, int n, int k) {
		int i = 0, j = n - 1, c = 0;
		Arrays.sort(a);
		while (i < j) {
			if (a[i] + a[j] == k) {
				++c;
				System.out.println(a[i] + " " + a[j]);
				i++;
				j--;
			} else if (a[i] + a[j] < k)
				i++;
			else if (a[i] + a[j] > k)
				j--;
		}
		if (c == 0)
			System.out.println("Not present");
	}

	static void solve(int []a, int n, int k) {
		HashSet<Integer> h = new HashSet<>();
		Arrays.sort(a);
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (h.contains(k - a[i])) {
				++c;
				System.out.println(a[i] + " " + (k - a[i]));
			} else
				h.add(a[i]);
		}
		if (c == 0)
			System.out.println("Not present");
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 5;
		int []a = {2, 3, 4, 5, 1};
		solve(a, n, k);
	}
}