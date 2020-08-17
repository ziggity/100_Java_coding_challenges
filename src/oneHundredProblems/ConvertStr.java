package oneHundredProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given the string s. Your friend just asked you if it's possible to change the string from s to a string t by removing some characters from it. You're a pro at programming, so you decided to create a program to determine this.

Example

For s = "ceoydefthf5iyg5h5yts" and t = "codefights", the output should be convertString(s, t) = true.

For s = "addbyca" and t = "abcd", the output should be convertString(s, t) = false.

Hints

concat()
split()
Input/Output

[execution time limit] 4 seconds (js)

[input] string s A string with alphanumeric characters.

Guaranteed constraints:

1 ≤ s.length ≤ 1000.

[input] string t

A string with alphanumeric characters.

Guaranteed constraints: 1 ≤ t.length ≤ 1000.

[output] boolean Return true if it is possible to convert s to t, otherwise return false.
 */
public class ConvertStr {

	public static void main(String[] args) {
		String string1 = "ceoydefthf5iyg5h5yts";
		String string2 = "codefights";
		System.out.println(convertString(string1, string2));

	}

	private static boolean convertString(String s1, String s2) {
		List word = new ArrayList<>();
		int index = 0;
		String[] sChars = s1.split("");
		String[] s2Chars = s2.split("");
		for (int i = 0; i < s1.length(); i++) {
			if(sChars[i] == s2Chars[index]) {
				word.add(sChars[i]);
				index++;
				System.out.println(word.toString() + " " + s2);

				if(word.toString() == s2) {
					return true;
				}
			}
		}
		
		return false;
	}

}
