package oneHundredProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

Hints

includes()
split()
push()
Input/Output

[execution time limit] 4 seconds (js)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:

3 ≤ s.length ≤ 1000.

[output] integer
 */
public class DiffSymbolsNaive {

	public static void main(String[] args) {
	String input = "cabca"; // return 3;
	System.out.println(diffSymbols(input));
	}

	private static int diffSymbols(String input) {
		List uniqueChars = new ArrayList<>();
		String[] inputChars = input.split("");
		for(String s : inputChars) {
			if(!uniqueChars.contains(s)) {
				uniqueChars.add(s);
			}
		}
		return uniqueChars.size();
	}

}
