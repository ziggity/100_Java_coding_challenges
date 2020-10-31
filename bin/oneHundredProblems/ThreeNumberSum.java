package 100_java

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105

 */
import java.util.Arrays;

class ThreeNumberSum {

	// **** sort Array first -> o(n^2) approach ****
	public static void main(String[] args) {
		int n = 5;
		int k = 9;
		int []a = {1, 3, 5, 3, 2};
		int c = 0;
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {
			int l = i + 1, r = n - 1;
			while (l < r) {
				if (a[i] + a[l] + a[r] == k) {
					++c;
					System.out.println(a[i] + " " + a[l] + " " + a[r]);
					++l;
					r--;
				} else if (a[i] + a[l] + a[r] > k)
					r--;
				else if (a[i] + a[l] + a[r] < k)
					l++;
			}
		}
		if (c == 0)
			System.out.println("Not present");
	}
}
