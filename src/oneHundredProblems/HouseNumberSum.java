package oneHundredProblems;
/*
 * Algorithm Challenge Available At CodeFights
A boy is walking a long way from school to his home. To make the walk more fun he decides to add up all the numbers of the houses that he passes by during his walk. Unfortunately, not all of the houses have numbers written on them, and on top of that the boy is regularly taking turns to change streets, so the numbers don't appear to him in any particular order.

At some point during the walk the boy encounters a house with number 0 written on it, which surprises him so much that he stops adding numbers to his total right after seeing that house.

For the given sequence of houses determine the sum that the boy will get. It is guaranteed that there will always be at least one 0 house on the path.

Example

For inputArray = [5, 1, 2, 3, 0, 1, 5, 0, 2], the output should be houseNumbersSum(inputArray) = 11.

The answer was obtained as 5 + 1 + 2 + 3 = 11.

Input/Output

[execution time limit] 5 seconds (ts)
[input] array.integer inputArray
Guaranteed constraints:

5 ≤ inputArray.length ≤ 10, 0 ≤ inputArray[i] ≤ 10.

[output] integer
 */
/*
 * Version 2.0 (Find the longest combined values of houses connected together before finding a house with a 0)
 */
public class HouseNumberSum {

	public static void main(String[] args) {
		int[] houseNumbers = {5, 1, 2, 3, 0, 1, 5, 0, 2, 9, 8, 3, 1, 8, 0, 1,0};
		System.out.println(houseNumberSum(houseNumbers));
		System.out.print(" version 2 :");
		System.out.println(houseNumberSum2(houseNumbers));

	}

	

	private static int houseNumberSum(int[] houseNumbers) {
		int count = 0;
		for(int i = 0; i < houseNumbers.length; i++) {
			count += houseNumbers[i];
			if(houseNumbers[i] == 0) {
				return count;
			}
		}
		return count;
	}

	private static int houseNumberSum2(int[] houseNumbers) {
		int temp = -1;
		int count = 0;
		for(int i = 0; i < houseNumbers.length; i++) {
			count += houseNumbers[i];
			if(houseNumbers[i] == 0) {
				if(temp < count && i != houseNumbers.length-1) {
					System.out.println(temp + " " + count);
					temp = count;
					count = 0;
				}
				if(i == houseNumbers.length -1) {
					System.out.println(count + " count");
					System.out.println(temp + " temp");
					return Math.max(count, temp);
				}
				
			}
		}
		return count;
	}
}
