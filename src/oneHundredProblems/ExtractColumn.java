package oneHundredProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a rectangular matrix and an integer column, return an array containing the elements of the columnth column of the given matrix (the leftmost column is the 0th one).

Example

For matrix = [[1, 1, 1, 2], [0, 5, 0, 4], [2, 1, 3, 6]]

      and column = 2, the output should be
      extractMatrixColumn(matrix, column) = [1, 0, 3].
Hints

push()
Input/Output

[execution time limit] 5 seconds (ts)
[input] array.array.integer matrix 2-dimensional array of integers representing a rectangular matrix.
Guaranteed constraints: 1 ≤ matrix.length ≤ 4, 1 ≤ matrix[0].length ≤ 4, 0 ≤ matrix[i][j] ≤ 300.

[input] integer column An integer not greater than the number of matrix columns.
Guaranteed constraints: 0 ≤ column ≤ matrix[i].length - 1.

[output] array.integer
 */
public class ExtractColumn {

	public static void main(String[] args) {
		int[][] input1 = {{1, 1, 1, 2},{0, 5, 0, 4},{2, 1, 3, 6}} ;
		
		int num = 2;
		System.out.println(extractCol(input1, num));
	}

	private static String extractCol(int[][] input1, int num) {
		List results = new ArrayList();
		for(int[] i : input1) {
			results.add(i[num]);
			
		}
		 //matrix.forEach((row) => matrixCol.push(row[column]));
		return results.toString();
	}

}
