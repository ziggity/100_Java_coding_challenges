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
		String alpha = "helloworld";
		System.out.println(alphabetShifter(alpha));
	}

	private static ArrayList alphabetShifter(String alpha) {
//		alpha.toCharArray(); 
//		String[] a = alpha.split("");
//		ArrayList answer = new ArrayList<>();
//		for(int z = 0; z < a.length; z++ ) {
//			if(a[z] == "z") {
//				a[z] = "_";
//			}
//			answer.add(a[z]);
//		}
//		for(int i = 0; i<answer.size(); i++) {
//			if(answer.get(i) == "_") {
//				answer.add("a");
//				answer.remove(i);
//			} else {
//				char c = (char) answer.get(i);
//				answer.remove(i);
//				
//				answer.add(Character.toString(c));
//			
//			}
//		}
//		return answer;
	}
	
	
}
