package oneHundredProblems;

import java.util.Arrays;

/*
 * You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be avoidObstacles(inputArray) = 4.

Check out the image below for better understanding:



Hints

sort()
every()
Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray
Non-empty array of positive integers.

Guaranteed constraints:

2 ≤ inputArray.length ≤ 10,

1 ≤ inputArray[i] ≤ 40.

[output] integer
The desired length.
 */
public class AvoidObstacles {

	public static void main(String[] args) {
		int[] arr1 = {5,3,6,7,9};
		System.out.println(avoidObstacles(arr1));
	}

	private static int avoidObstacles(int[] arr1) {
		int jumpMin = 0;
		Arrays.parallelSort(arr1);
		int largestVal = arr1[arr1.length-1];
		for(int i = 0; i <= largestVal +1; i++) {
			for(int j : arr1) {
				if(i != 0 && j % i != 0) {
					return i;
				}
			}
		}
		return largestVal;
	
	}

}
