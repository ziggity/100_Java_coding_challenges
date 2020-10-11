package oneHundredProblems;
/*
 * Given a string, enclose it in round brackets.

Example

For inputString = "abacaba", the output should be encloseInBrackets(inputString) = "(abacaba)".

Input/Output

[execution time limit] 5 seconds (ts)

[input] string inputString

Guaranteed constraints:

0 ≤ inputString.length ≤ 10

[output] string
 */
public class EnclosedInBrackets {

	public static void main(String[] args) {
//return `(${inputString})`;
		System.out.println(encloseInBracket("aaba"));
	}

	private static String encloseInBracket(String string) {
		StringBuilder encloseBrackets = new StringBuilder();
		encloseBrackets.append("(");
		encloseBrackets.append(string);
		encloseBrackets.append(")");
		return encloseBrackets.toString();
	}

}
