package oneHundredProblems;
/*
 * Return the factorial of the provided integer.

If the integer is represented with the letter n, a factorial is the product of all positive integers less than or equal to n.

Factorials are often represented with the shorthand notation n!

For example: 5! = 1 * 2 * 3 * 4 * 5 = 120

Only integers greater than or equal to zero will be supplied to the function.

Remember to use Read-Search-Ask if you get stuck. Write your own code.

Example

factorializeANumber(5) returns 120;
factorializeANumber(10) returns 3628800;
 */
public class FactoriializeNum {

	public static void main(String[] args) {

		System.out.println(factorializeNum(6));
	}

	private static int factorializeNum(int num) {
		int total = 1;

	    for(int i = 1; i <= num; i++) {
	        total = i * total;
	    }
	    
	    return total;
	}

}
