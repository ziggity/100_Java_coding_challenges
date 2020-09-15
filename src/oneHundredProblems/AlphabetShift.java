package oneHundredProblems;

import java.util.ArrayList;

/*
 * Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).

Example

For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".

Hints

split()
indexOf()
join()
Input/Output

[time limit] 4000ms (js)
[input] string inputString
Non-empty string consisting of lowercase English characters.

Guaranteed constraints:

1 ≤ inputString.length ≤ 10.

[output] string
The result string after replacing all of its characters.
 */
public class AlphabetShift {
	public static void main(String[] args) {
		String alpha = "a ! helloworld ?/';:[]}{| =- 0987654321 z";
		System.out.println(alphabetShifter(alpha, 10));
	}

	private static String alphabetShifter(String msg, int shift) {

		    String s = "";
		    int len = msg.length();
		    for(int x = 0; x < len; x++){
		        char c = (char)(msg.charAt(x) + shift);
		        if (c > 'z')
		            s += (char)(msg.charAt(x) - (26-shift));
		        else
		            s += (char)(msg.charAt(x) + shift);
		    }
		    return s;
		}
	
	
}
