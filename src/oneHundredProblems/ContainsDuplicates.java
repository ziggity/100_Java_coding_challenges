package oneHundredProblems;

import java.util.Arrays;

/*
 * Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.

Example

For a = [1, 2, 3, 1], the output should be containsDuplicates(a) = true.
There are two 1s in the given array.

For a = [3, 1], the output should be containsDuplicates(a) = false.
The given array contains no duplicates.

Hints

sort()
Input/Output

[execution time limit] 5 seconds (ts)

[input] array.integer a A sorted array of unique integers.

Guaranteed constraints:

0 ≤ a.length ≤ 105, -2 · 109 ≤ a[i] ≤ 2 · 109.

[output] boolean
 */
public class ContainsDuplicates {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 1};
		System.out.println(containsDupes(input));
	}

	private static boolean containsDupes(int[] input) {
		
	 Arrays.sort(input);
	for(int i = 0; i < input.length; i++) {
		if(input[i] == input[i+1]) {
			return true;
		}
	}
		return false;
	}
}
