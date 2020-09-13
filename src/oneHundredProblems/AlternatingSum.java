package oneHundredProblems;

import java.util.ArrayList;

/*
 * Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be alternatingSums(a) = [180, 105].

Input/Output

[time limit] 4000ms (js)
[input] array.integer a
Guaranteed constraints:

1 ≤ a.length ≤ 10,

45 ≤ a[i] ≤ 100.

[output] array.integer
 */
import java.util.ArrayList;

public class AlternatingSum {

	public static void main(String[] args) {
		int[] arrayNums = {50, 60, 60, 45, 70}; // alternating sum should be 180, 105
		
		System.out.println(lternatingSums(arrayNums));
		
	}

	private static Object lternatingSums(int[] arrayNums) {
		int odds = 0;
		int evens = 0;
		ArrayList results = new ArrayList<>();

		for(int i = 0; i<arrayNums.length; i++) {
			if(i % 2 == 0) {
				evens += arrayNums[i];
			} else {
				odds += arrayNums[i];
			}
		}
		results.add(evens);
		results.add(odds);
		return results;
	}
}
