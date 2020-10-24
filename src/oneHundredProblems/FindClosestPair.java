package oneHundredProblems;
/*
 * Given an array of integers numbers, we'd like to find the closest pair of elements that add up to sum. Return the distance between the closest pair (absolute difference between the two indices). If there isn't a pair that adds up to sum, return -1.

Example

For numbers = [1, 0, 2, 4, 3, 0] and sum = 5 the output should be findClosestPair(numbers, sum) = 2. 1 and 4 have a sum of 5, but 2 and 3 are closer.

For numbers = [2, 3, 7] and sum = 8 the output should be findClosestPair(numbers, sum) = -1. There are no pairs that have a sum of 8.

Hints

Math.abs()
Input/Output

[execution time limit] 5 seconds (ts)

[input] array.integer numbers

An array of integers.

Guaranteed intraints:

2 ≤ numbers.length ≤ 3 · 105 -1000 ≤ numbers[i] ≤ 1000

[input] integer sum
An integer representing the sum of the pair we're looking for.

Guaranteed intraints:

-2000 ≤ sum ≤ 2000

[output] integer
An integer representing the difference between the indices of the closest pair of elements that add up to sum (or -1 if there isn't one).
 */
public class FindClosestPair {

	public static void main(String[] args) {
		int[] inputarray = {1, 0, 2, 4, 3, 0};
	System.out.println(findClosestPair(inputarray, 5));
	}

	private static int findClosestPair(int[] numbers, int sum) {

		int distance = -1;

	    for(int i=0; i<numbers.length; i++){
	        for(int j=i+1; j<numbers.length -1; j++){
	            int distanceSum = numbers[i] + numbers[j];
	            int absDistance = Math.abs(i-j);
	            if(sum==distanceSum){
	                if(distance == -1 || absDistance < distance){
	                    distance = absDistance;
	                }
	            }
	        }
	    }
	    return distance;
	}

}
