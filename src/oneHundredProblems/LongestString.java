package oneHundredProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Hints

None
Input/Output

[time limit] 4000ms (js)
[input] array.string inputArray
A non-empty array.

Guaranteed constraints:

1 ≤ inputArray.length ≤ 10,

1 ≤ inputArray[i].length ≤ 10.

[output] array.string
Array of the longest strings, stored in the same order as in the inputArray.
 */
public class LongestString {

	public static void main(String[] args) {
		String[] array1 = {"aba", "aa", "ad", "vcd", "aba"};
		System.out.println(longestString(array1));
	}

	private List result;

	private static ArrayList longestString(String[] array1) {
		int longestLen = 0;
		ArrayList<String> result = new ArrayList<>();
		for(String word : array1) {
			if(word.length() >= longestLen) {
				longestLen = word.length();
			}
		}
		for(String word2 : array1) {
			if(word2.length() == longestLen) {
				result.add(word2);
			}
		}
		 Collections.sort(result);  
		 return  result;
	}

}
