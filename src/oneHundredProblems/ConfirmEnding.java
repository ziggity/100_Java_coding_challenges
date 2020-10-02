package oneHundredProblems;
/*
 * Check if a string (first argument, str) ends with the given target string (second argument, target).

This challenge can be solved with the .endsWith() method, which was introduced in ES2015. But for the purpose of this challenge, we would like you to use one of the JavaScript substring methods instead.

Remember to use Read-Search-Ask if you get stuck. Write your own code.

Example

confirmEnding("Abstraction", "action") returns true;
confirmEnding("Open sesame", "pen") returns false;
Hints

substr()
 */
public class ConfirmEnding {

	public static void main(String[] args) {
		String n = "Abstraction"; 
		String n2 = "action";
System.out.println(confirmEnding(n,  n2));
	}

	private static boolean confirmEnding(String n, String n2) {
		int start = n.length() - n2.length();
		return n.substring(start, n.length()) == n2;
	}

}