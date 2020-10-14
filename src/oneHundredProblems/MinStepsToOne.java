package oneHundredProblems;
/*
 * Given a number n, count minimum steps to minimize it to 1 according to the following criteria:

If n is divisible by 2 then we may reduce n to n/2.
If n is divisible by 3 then you may reduce n to n/3.
Decrement n by 1.
 */
public class MinStepsToOne {

	public static void main(String[] args) {
		System.out.println(recurse(5));
		System.out.println(minStepsUsingMemo(5));
	}

	private static int minStepsUsingMemo(int i) {
		return i;
	}
	
	public static int recurse(int curr) {
		//base case:
		if(curr == 1) {
			return 0;
		}
	
		int steps = recurse(curr -1);
		// div2
		if(curr % 2 == 0) {
			int divBy2 = recurse(curr/2);
			steps = Math.min(steps, divBy2);
		}
		//div3
		if(curr % 3 == 0) {
			int divBy3 = recurse(curr/3);
			steps = Math.min(steps, divBy3);
		}
		int result = steps + 1;
		
		
		return result;
	}
	
	
	

}
