package oneHundredProblems;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a sorted integer array that does not contain any duplicates, return a summary of the number ranges it contains.

Example

For nums = [-1, 0, 1, 2, 6, 7, 9], the output should be composeRanges(nums) = ["-1->2", "6->7", "9"].
Hints

push()
Input/Output

[execution time limit] 5 seconds (ts)

[input] array.integer nums A sorted array of unique integers.

Guaranteed constraints:

0 ≤ nums.length ≤ 15, (231 - 1) ≤ nums[i] ≤ 231 - 1.

[output] array.string
 */

import java.util.ArrayList;
import java.util.List;

public class ComposeNums {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, 6, 7, 9};
		System.out.println(composeRanges(nums));
		int[] nums1 = {};
		System.out.print("0 length array: ");
		System.out.println(composeRanges(nums1));
	}
		public static String[] composeRanges(int[] nums) {
			  List<List<String>> list= new ArrayList<>();
			  if(nums.length == 0) return new String[0];
			  List<String> sub = new ArrayList<>();
			  sub.add(""+nums[0]);
			  for(int i = 1; i < nums.length; i++){
			    if(nums[i] - nums[i-1] == 1){
			      sub.add(""+nums[i]);
			    }else{
			       System.out.println(sub.toString());
			       list.add(sub);      
			       sub = new ArrayList<>();
			       sub.add(""+nums[i]); 
			       System.out.println("sub2");
			    }
			  }
			  if(sub.size() > 0)  list.add(sub); 
			  System.out.println(list.toString());
			  String[] res = new String[list.size()];
			  for(int i=0 ; i< list.size(); i++){
			     List<String> sub1 = list.get(i);
			     if(sub1.size() == 1){
			       res[i]= sub1.get(0);
			     }else{
			       res[i]= sub1.get(0)+"->"+ sub1.get(sub1.size()-1);
			     }
			  }
			      
			  return res;  
			}
}
	

