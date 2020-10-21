package oneHundredProblems;
/*
 * Being a new Uber user, you have $20 off your first ride. You want to make the most out of it and drive in the fanciest car you can afford, without spending any out-of-pocket money. There are 5 options, from the least to the most expensive: "UberX", "UberXL", "UberPlus", "UberBlack" and "UberSUV".

You know the length l of your ride in miles and how much one mile costs for each car. Find the best car you can afford.

Example

For l = 30 and fares = [0.3, 0.5, 0.7, 1, 1.3], the output should be fancyRide(l, fares) = "UberXL".
The cost for the ride in this car would be $15, which you can afford, but "UberPlus" would cost $21, which is too much for you.

Input/Output

[execution time limit] 5 seconds (ts)

**[input] integer l

A positive number representing the length of the ride.

Guaranteed constraints:

4 ≤ l ≤ 30.

[input] array.float fares
A strictly increasing array of 5 elements. fares[0] stands for dollars per mile in "UberX", fares[1] is the same for "UberXL", etc.

Guaranteed constraints:

0.3 ≤ fares[i] ≤ 5.0.


 */
public class FancyRide {

	public static void main(String[] args) {
		String[] ubers = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
		double[] fares = {0.3, 0.5, 0.7, 1, 1.3};
		int miles = 50;

		System.out.println(fancyRide(ubers, fares, miles));
	}

	private static String fancyRide(String[] ubers, double[] fares, int miles) {
		 for (int i = fares.length - 1; i >= 0; i--) {
		        if (fares[i] * miles <= 20) {
		        	
		            return ubers[i];
		        }
		    }
		return null;
	}

}
