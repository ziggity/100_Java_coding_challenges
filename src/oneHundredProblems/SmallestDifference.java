package oneHundredProblems;

import java.util.Arrays;
/*
 * 1200. Minimum Absolute Difference
Easy

413

24

Add to List

Share
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 

Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
 

Constraints:

2 <= arr.length <= 10^5
-10^6 <= arr[i] <= 10^6
 */
class SmallestDifference {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		int []arr1 = {2, 4, 1, 3, 5};
		int []arr2 = {6, 7, 8, 9, 11};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0, sm = Integer.MAX_VALUE, c = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				++c;
				System.out.println("0");
				break;
			} else if (arr1[i] < arr2[j]) {
				sm = Math.min(sm, arr2[j] - arr2[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				sm = Math.min(sm, arr2[j] - arr2[i]);
				j++;
			}
		}
		if (c == 0)
			System.out.println(sm);
	}
}

