package oneHundredProblems;

import java.awt.List;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a function that splits an array (first argument) into groups the length of size (second argument) and returns them as a two-dimensional array.

Example

chunkyMonkey(["a", "b", "c", "d"], 2) should return [["a", "b"], ["c", "d"]].
chunkyMonkey([0, 1, 2, 3, 4, 5], 4) should return [[0, 1, 2, 3], [4, 5]].
Hints

slice()
 */
public class ChunkyMonkey {
public static void main(String[] args) { 
	String[] input = {"a", "b", "c", "d"};
	System.out.println(chunkyMonkey(input, 2)); // should be [a,b], [c,d]
}

private static String chunkyMonkey(String[] input, int num) {
	CharBuffer result = null;
	CharBuffer finalResult = CharBuffer.allocate(input.length);
	int count = 0;
	 CharBuffer cb1 = CharBuffer.allocate(input.length); 
	 for(int i = 0; i<input.length; i++) {
		 cb1.put(input[i]);
	 }
	 
	// System.out.println(Arrays.toString(cb1.array()));
    // System.out.println("position: " + cb1.position()); 
    // System.out.println("capacity: " + cb1.capacity()); 
     
     for(int i = 0; i<input.length; i+=num) {
    	 result = cb1.slice();
    	 finalResult.put(result);
    	 System.out.println(result);
     }
		
	return finalResult.toString();
}
}
