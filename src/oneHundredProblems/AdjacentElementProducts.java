package oneHundredProblems;
/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Hints

None
Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray
An array of integers containing at least two elements.

Guaranteed constraints:

2 ≤ inputArray.length ≤ 10, -1000 ≤ inputArray[i] ≤ 1000.

[output] integer
The largest product of adjacent elements.


*/

public class AdjacentElementProducts {
//Return the largest product of adjacent elements
	public static void main(String[] args) {
		int[] array1 = {10, 3, 6, -2, -5, 8,3};
		System.out.println(adjacentElementProduct(array1));
	}

	private static int adjacentElementProduct(int[] array1) {
		int largestProduct = 0;
		for(int i = 0; i < array1.length -1; i++) {
			int product = array1[i] * array1[i+1];
			if(product > largestProduct) {
				largestProduct = product;
			}
		}
		return largestProduct;
	}

}
