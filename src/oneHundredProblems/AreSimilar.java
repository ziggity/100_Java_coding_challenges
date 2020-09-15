package oneHundredProblems;

import java.util.Arrays;

/*
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be areSimilar(a, b) = true.
The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be areSimilar(a, b) = true.
We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be areSimilar(a, b) = false.
Any swap of any two elements either in a or in b won't make a and b equal.

Hints

toString()
reverse()
Input/Output

[time limit] 4000ms (js)
[input] array.integer a
Array of integers.

Guaranteed constraints:

3 ≤ a.length ≤ 105,

1 ≤ a[i] ≤ 1000.

[input] array.integer b
Array of integers of the same length as a.

Guaranteed constraints:

b.length = a.length,

1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
 */
public class AreSimilar {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3}; 
		
		int[] arr3 = {1, 2, 2};
		int[] arr4 = {2, 1, 1};
		
		int[] arr5 = {1, 2, 3};
		int[] arr6 = {2, 1, 3};
	
		System.out.println(areSimilars(arr1, arr2)); // true
		System.out.println("*************** CONSOLE SEPARATOR ********************");
		System.out.println(areSimilars(arr3, arr4)); // false
		System.out.println("*************** CONSOLE SEPARATOR ********************");
		System.out.println(areSimilars(arr5, arr6));//true
	}

private static boolean areSimilars(int[] arrOne, int[] arrTwo) {
		if(arrOne.length != arrTwo.length) return false;
		
		int countSwapper = 0;
		
		int[] numC = Arrays.copyOf(arrOne, arrOne.length);
		int[] numD = Arrays.copyOf(arrTwo, arrTwo.length);
		
		if(arrOne.toString() == arrTwo.toString()) return true;

		for(int i = 0; i < arrOne.length; i++) {
			if(arrOne[i] != arrTwo[i]) {
				countSwapper++;
			}
		}
		return (countSwapper == 2 || countSwapper ==0);	
	}
}

