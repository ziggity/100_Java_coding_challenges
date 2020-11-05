package oneHundredProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Flatten a nested array. You must account for varying levels of nesting.

Example

steamrollArray([[["a"]], [["b"]]]) should return ["a", "b"].

steamrollArray([1, [2], [3, [[4]]]]) should return [1, 2, 3, 4]

Hints

isArray()
push()
 */
public class FlattenArray {

	public static void main(String[] args) {
		
		  int[][] a = {
		            {1, -2, 3}, 
		            {-4, -5, 6, 9}, 
		            {7}, 
		        };
		System.out.println(a.toString());
		System.out.println(flatten(a));
		
	}

	 public static Integer[] flatten(Object[] inputArray) throws IllegalArgumentException {

	        if (inputArray == null) return null;

	        List<Integer> flatList = new ArrayList<Integer>();

	        for (Object element : inputArray) {
	            if (element instanceof Integer) {
	                flatList.add((Integer) element);
	            } else if (element instanceof Object[]) {
	                flatList.addAll(Arrays.asList(flatten((Object[]) element)));
	            } else {
	                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
	            }
	        }
	        return flatList.toArray(new Integer[flatList.size()]);
	    }
}
