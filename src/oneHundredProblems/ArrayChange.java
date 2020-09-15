package oneHundredProblems;
/*
 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be arrayChange(inputArray) = 3.

Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray
Guaranteed constraints:

3 ≤ inputArray.length ≤ 105,

-105 ≤ inputArray[i] ≤ 105.

[output] integer
The minimal number of moves needed to obtain a strictly increasing sequence from inputArray. It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.
 */
public class ArrayChange {

	public static void main(String[] args) {
		int[] arr1 = {1,1,1}; // should return 3 (1 stays, next one is moved up to 2, next 1 is moved up two spots so 3 movements total).
		int[] arr2 = {31,21,11};
		System.out.println(arrayChanger(arr1));	
		System.out.println(arrayChanger(arr2));	

	}

	private static int arrayChanger(int[] arr1) {
		int count = 0;
		for(int i = 0; i <= arr1.length; i++) {
			if((i < arr1.length -1) && arr1[i] >= arr1[i+1]){
				int difference = (arr1[i] +1) - arr1[i+1];
				arr1[i+1] = arr1[i] + 1;
				count += difference;
			}
		}
	
		
		return count;
	}
}
