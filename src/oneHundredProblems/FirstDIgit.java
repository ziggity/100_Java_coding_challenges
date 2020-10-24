package oneHundredProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be firstDigit(inputString) = '1';

For inputString = "q2q-q", the output should be firstDigit(inputString) = '2';

For inputString = "0ss", the output should be firstDigit(inputString) = '0'.

Hints

split()
includes()
Input/Output

[execution time limit] 5 seconds (ts)

[input] string inputString

A string containing at least one digit.

Guaranteed constraints:

3 ≤ inputString.length ≤ 10.

[output] char
 */
public class FirstDIgit {

	public static void main(String[] args) {
		String input = "var_1__In";
		System.out.println(firstDigit(input));
	}

	private static int firstDigit(String s) {
		int counter = 0;
		 while(counter < 1) {
			 for(int i=0;i<s.length();i++)
		 {
		    char c=s.charAt(i);
		    char d=s.charAt(i);
		    if ('a' <= c && c <= 'z')
		         System.out.println("String:-"+c);
		     else  if ('0' <= d && d <= '9')
		           System.out.println("number:-"+d);
		     counter++;
		     return d;
		     }
		    }
		return -1;
		
		
		
	}

}
