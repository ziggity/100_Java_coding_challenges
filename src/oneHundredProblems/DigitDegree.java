package oneHundredProblems;
/*
 * Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be digitDegree(n) = 0;
For n = 100, the output should be digitDegree(n) = 1. 1 + 0 + 0 = 1.
For n = 91, the output should be digitDegree(n) = 2. 9 + 1 = 10 -> 1 + 0 = 1.
Hints

toString()
parseInt()
split()
reduce()
Input/Output

[time limit] 4000ms (js)

[input] integer n

Guaranteed constraints:

5 ≤ n ≤ 109.

[output] integer
 */
public class DigitDegree {

	public static void main(String[] args) {
System.out.println(digitDegree(913999));
	}

	private static int digitDegree(int n) {
		int count = 0;
		int currentNum = n;
		if(n <= 9) {
			return count;
		} else {
			while(true) {
				count++;
				currentNum = getDigit(currentNum);
				if(currentNum <= 9) {
					break;
				}
			}
		}
		return count;
	}

	private static int getDigit(int currentNum) {
		String[] nums = Integer.toString(currentNum).split("");
		int total = 0;
		for(String i : nums) {
			total += Integer.parseInt(i);
		}
		return total;
	}

}