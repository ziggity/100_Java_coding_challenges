package oneHundredProblems;
/*
 * Check whether the given string is a subsequence of the plaintext alphabet.
 * 
 * Example
 * 
 * For s = "effg" or s = "cdce", the output should be alphabetSubsequence(s) =
 * false
 * 
 * For s = "ace" or s = "bxz", the output should be alphabetSubsequence(s) =
 * true.
 * 
 * Hints
 * 
 * size property charCodeAt() Input/Output
 * 
 * [execution time limit] 5 seconds (ts) [input] string s Guaranteed
 * constraints:
 * 
 * 2 ≤ s.length ≤ 15.
 * 
 * [output] boolean
 
 */
public class AlphabetSubsequence {
	public static void main(String[] args) {
	System.out.println(alphabetSubsequence("effg")); // should return false
	System.out.println(alphabetSubsequence("ace")); // true
	System.out.println(alphabetSubsequence("ayz")); // true
	}

	private static boolean alphabetSubsequence(String s) {
		boolean[] found = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
			if (found[c-'a'] || (i+1 < s.length() && c > s.charAt(i+1))) {
				System.out.println(s.charAt(i+1));
				return false;
			} else {
				System.out.println( "true: " + (c-'a'));
				found[c-'a'] = true;
			}
		}
		return true;
	}
}

