package oneHundredProblems;
/*
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Example

For sequence = [1, 3, 2, 1], the output should be almostIncreasingSequence(sequence) = false;
There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be almostIncreasingSequence(sequence) = true.
You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Hints

Nope
Input/Output

[time limit] 4000ms (js)
[input] array.integer sequence
Guaranteed constraints:

2 ≤ sequence.length ≤ 105,

-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
 */
public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] sequence = {4, 4, 1, 3, 2, 1}; // return false
		System.out.println(almostIncreasingSequence(sequence));
	}


	static boolean almostIncreasingSequence(int[] a) {
	    int count1 = 0 , count2 = 0;
	    for(int i = 0 ; i < a.length-1 ; i++){
	    	System.out.println(a[i] + " 1st " + a[i+1]);

	        if(a[i] >= a[i+1]) count1++;
	    }

	    for(int i = 0 ; i < a.length-2 ; i++){
	    	System.out.println(a[i] + " 2nd " + a[i+2]);
	        if(a[i] >= a[i+2]) count2++;
	    }
	     return (count1 <=1) && (count2 <= 1);
	}

	
}


