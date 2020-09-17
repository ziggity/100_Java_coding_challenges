package oneHundredProblems;
/*
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be arrayMaximalAdjacentDifference(inputArray) = 3.

Hints

Math.abs()
Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray
Guaranteed constraints:

3 ≤ inputArray.length ≤ 10,

-15 ≤ inputArray[i] ≤ 15.

[output] integer
The maximal absolute difference.
 */
public class ArrayMaxAdjacentDiff {
	public static void main(String[] args) {
		int [] arr1 = {2, 4, 1, 8};
		System.out.println(arrayMaxAdjacentDiff(arr1));
	}

	private static int arrayMaxAdjacentDiff(int[] arr1) {
		int maxDiff = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(i <= arr1.length-1 && i != 0) {
				int tempDiff = Math.abs(arr1[i-1] - arr1[i]);
				maxDiff = tempDiff > maxDiff ? tempDiff : maxDiff;
			}
			
		}
		return maxDiff;
	}
}
