package oneHundredProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given array of integers, for each position i, search among the previous positions for the last (from the left) position that contains a smaller value. Store this value at position i in the answer. If no such value can be found, store -1 instead.

Example

For items = [3, 5, 2, 4, 5], the output should be arrayPreviousLess(items) = [-1, 3, -1, 2, 4].

Hints

unshift()
Input/Output

[execution time limit] 5 seconds (ts)

[input] array.integer items

Non-empty array of positive integers.

Guaranteed constraints:

3 ≤ items.length ≤ 15,

1 ≤ items[i] ≤ 200.

[output] array.integer

Array containing answer values computed as described above.
 */
public class ArrayPrevious {

	public static void main(String[] args) {
		int[] arr1 = {3, 5, 2, 4, 5};
		System.out.println(arrayPrev(arr1));
	}

	private static List<Integer> arrayPrev(int[] arr1) {
		List<Integer> results = new ArrayList<Integer>();
		
		for(int i = arr1.length -1; i>= 0; i--) {
			for(int j = i; j >= 0; j--) {
				System.out.println(arr1[i] + " " + i + " " + j);
				if(arr1[i] > arr1[j]) {
					results.add(arr1[j]);
					break;
				} else if (j==0) {
					results.add(-1);
				}
			}
		}
		
		return results;
	}

}
