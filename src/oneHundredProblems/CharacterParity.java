package oneHundredProblems;
/*
 * Given a character, check if it represents an odd digit, an even digit or not a digit at all.

Example

For symbol = '5', the output should be characterParity(symbol) = "odd";
For symbol = '8', the output should be characterParity(symbol) = "even";
For symbol = 'q', the output should be characterParity(symbol) = "not a digit".
Hints

isNaN()
parseInt()
Input/Output

[execution time limit] 5 seconds (ts)
[input] char symbol
[output] string
 */
public class CharacterParity {
	public static void main(String[] args) {
		System.out.println(charParity("8"));
		System.out.println(charParity("9"));
	}

private static boolean charParity(String c) {
	int result = Integer.parseInt(c);

	return Double.isNaN(result);
}
}
