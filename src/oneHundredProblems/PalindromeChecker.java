package oneHundredProblems;
/*
 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar. There are also numeric palindromes, including date/time stamps using short digits 11/11/11 11:11 and long digits 02/02/2020.
 */
public class PalindromeChecker {

	public static void main(String[] args) {

		String str = "tacocat1";
		int numTries = 100;
	    long begTime = System.currentTimeMillis();
	    for (int i = 0; i < numTries; ++i) {
			System.out.println(Palindrome1(str));

	    }
	    long endTime = System.currentTimeMillis();
	    System.out.printf("Total time for %10d tries: %d ms\n", numTries, (endTime-begTime));
	    
	    long beg1Time = System.currentTimeMillis();
	    for (int i = 0; i < numTries; ++i) {
			System.out.println(PalindromeFaster(str));

	    }
	    long endTime2 = System.currentTimeMillis();
	    System.out.printf("Total time for %10d tries: %d ms\n", numTries, (endTime2-beg1Time));
	}
	
	//O(n) space && O(n) time
		static boolean Palindrome1(String str) {
			StringBuffer sb = new StringBuffer();
			for (int i = str.length() - 1; i >= 0; i--)
				sb.append(str.charAt(i));
System.out.println("Slower forloop");
			return sb.toString().equals(str);
		}

		// O(1) space && O(n) time
		static boolean PalindromeFaster(String str) {
			int i = 0, j = str.length() - 1;
			while (j > i) {
				if (str.charAt(i) != str.charAt(j)) {
					System.out.println("Faster whileloop");
					return false;
				}
				j--;
				i++;
			}
			System.out.println("whileloop");
			return true;
		}


}
