package oneHundredProblems;
import java.util.*;
/*
 * There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

Example 1:

Input: [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
             The third child gets 1 candy because it satisfies the above two conditions.
 */
class MinRewards {

	//Approach 1: Naive Approach

	static void solve1(int []a, int n, int []reward) {

		for (int i = 1; i < n; i++) {
			int j = i - 1;
			if (a[i] > a[j])
				reward[i] = reward[j] + 1;
			else {
				while (j >= 0 && a[j] > a[j + 1]) {
					reward[j] = Math.max(reward[j], reward[j + 1] + 1);
					j--;
				}
			}
		}
		for (int i : reward)
			System.out.print(i + " ");
		System.out.println();
	}

	//Approach 2: LocalMin Approach here k

	static ArrayList<Integer> localMin(int []a, int n) {
		ArrayList<Integer> list = new ArrayList<>();
		if (n == 1) {
			list.add(0);
			return list;
		}

		for (int i = 0; i < n; i++) {
			if (i == 0 && a[i] < a[i + 1])
				list.add(i);
			else if (i == n - 1 && a[i] < a[i - 1])
				list.add(i);
			else if (a[i + 1] > a[i] && a[i] < a[i - 1])
				list.add(i);
		}
		return list;
	}

	static void solve2(int []a, int n, int []reward) {

		ArrayList<Integer> list = localMin(a, n);
		for (int i : list) {
			int leftIndex = i - 1;
			while (leftIndex >= 0 && a[leftIndex + 1] < a[leftIndex]) {
				reward[leftIndex] = Math.max(reward[leftIndex], reward[leftIndex + 1] + 1);
				leftIndex--;
			}
			int rightIndex = i + 1;
			while (rightIndex < n && a[rightIndex - 1] < a[rightIndex]) {
				reward[rightIndex] = Math.max(reward[rightIndex], reward[rightIndex - 1] + 1);
				rightIndex++;
			}
		}
		for (int i : reward)
			System.out.print(i + " ");
		System.out.println();
	}

	//Approach 3: Fast Approach

	static void solve3(int []a, int n, int []reward) {
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i - 1])
				reward[i] = reward[i - 1] + 1;
		}
		for (int i = n - 2; i >= 0; i--) {
			if (a[i] > a[i + 1])
				reward[i] = Math.max(reward[i], reward[i + 1] + 1);
		}
		for (int i : reward)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 5;
		int []a = {6, 4, 1, 5, 3};
		int []reward = new int[n];
		Arrays.fill(reward, 1);
		solve3(a, n, reward);
	}

}