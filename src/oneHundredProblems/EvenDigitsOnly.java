package oneHundredProblems;
/*
 * Check if all digits of the given integer are even.

Example

For n = 248622, the output should be evenDigitsOnly(n) = true;
For n = 642386, the output should be evenDigitsOnly(n) = false.
Hints

toString()
split()
every()
parseInt()
Input/Output

[time limit] 4000ms (js)
[input] integer n
Guaranteed constraints:

1 ≤ n ≤ 109.

[output] boolean
true if all digits of n are even, false otherwise.

 const digits = n.toString().split('');

    return digits.every((digit) => parseInt(digit) % 2 === 0);
}

 */
public class EvenDigitsOnly {

	public static void main(String[] args) {
		System.out.println(evenDigitsOnly(248622));
		System.out.println(evenDigitsOnly(2478622));

		
	}

	private static boolean evenDigitsOnly(int i) {
		String[] digits = Integer.toString(i).split("");
		int count =0;
		for(String d : digits) {
			if(Integer.parseInt(d) % 2 != 0) return false;
		}
		return true;
	}

}
