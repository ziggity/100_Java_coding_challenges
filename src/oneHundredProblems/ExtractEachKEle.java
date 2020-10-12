package oneHundredProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

Hints

filter()
Input/Output

[execution time limit] 4 seconds (js)
[input] array.integer inputArray
Guaranteed constraints: 5 ≤ inputArray.length ≤ 15, -20 ≤ inputArray[i] ≤ 20.

[input] integer k
Guaranteed constraints: 1 ≤ k ≤ 10.

[output] array.integer inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
 */
public class ExtractEachKEle {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(extractEachEle(input, 3));
	}

	private static String extractEachEle(int[] input, int k) {
		List result = new ArrayList<Integer>();
		for(int i = 0; i < input.length; i++) {
			if((i + 1) % k != 0) {
				result.add(input[i]);
			}
		}
		return result.toString();
	}

}
