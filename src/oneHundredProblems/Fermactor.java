package oneHundredProblems;
/*
 * Fermat's factorization method is: If a · b = n (where a ≤ b), then there exist some c and d such that n = c^2 - d^2. Your goal is to return for given n such c and d as an array. Since we want c and d to be uniquely determined, in all test cases n is a semiprime number.

Example

For n = 15, the output should be fermactor(n) = [4, 1]. 15 = 4^2 - 1^2.
Hints

Math.pow()
Input/Output

[execution time limit] 4 seconds (js)

[input] integer n

A semiprime number.

Guaranteed constraints:

10 < n < 109.

[output] array.integer
c and d are guaranteed to be integers if the difference between a and b is even. For all test cases, this is true.
 */
public class Fermactor {

	public static void main(String[] args) {
		System.out.println(fermactor(28));
	}

	private static boolean fermactor(int n) {
		for (int i=1; i<n; i++){
	        for(int j=1; j<i; j++){
	            int total =  (int) (Math.pow(i,2) - Math.pow(j,2));
	            if(total == n){
	                System.out.println(i + " " + j);
	            }
	        }
	}
		return true;
	}
}


