package oneHundredProblems;

/*
 *  Is it luxury apts, business apts, i bet they will say just all apts ( so you need to design for the average case)
-Online or offline service (don't assume things). I bet they will say online and say US

Steps 2: Understand Users

- Who are the users? Probably the most important question to ask is "what are the pain points and motivation". Pain points : time take to search an apartment, fake listings, unable to carry out transactions online
Motivation: save time, search and get an accurate apartment

Step 3: Use Case

-How do they use the application. One scenario is they would search online and find an apartment and perform all the other required tasks to acquire rental

Step 4: Design Features

-Introduce presets to search for an apartment- The idea is that throught the year, when a user encounters something they like say stainless stell, or location they will add it their profile. When time to search for an apartment the system already knows what they like and retrives that. Saves time in searching.

-Introduce rating system- organically fraudulent landlords will start to shift out

-Another pain point is time spend visiting apartments. Since its facebook; Introduce Virtual Reality technology into viewing apartments ( this a moonshot idea). With that technology you never have to visit an apartment. You wil have a good idea of the size and so forht

- finally allow credit checks e.t.c to be done through the system
 */
import java.util.*;

class ApartmentHunting {

	static int solve(TreeMap < Integer, HashMap<String, Boolean>> buildings, String[]req) {
		int[][] position = new int[req.length][buildings.size()];
		int c = 0;
		for (String i : req)
			position[c++] = getclosestLeftRight(i, buildings);

		return getminMaximum(position, req.length, buildings.size());
	}

	static int[] getclosestLeftRight(String req, TreeMap < Integer, HashMap<String, Boolean>> buildings) {

		int[] minDistance = new int[buildings.size()];
		int index = Integer.MAX_VALUE;
		List<Integer> set = new ArrayList<>(buildings.keySet());
		for (int i : set) {
			if (buildings.get(i).get(req))
				index = i;

			minDistance[i] = Math.abs(i - index);
		}
		Collections.reverse(set);
		for (int i : set) {
			if (buildings.get(i).get(req))
				index = i;

			minDistance[i] = Math.min(minDistance[i], Math.abs(i - index));
		}

		return minDistance;
	}

	static int getminMaximum(int[][] position, int row, int col) {
		int max = 0, min = Integer.MAX_VALUE, pos = 0, tempPos = 0;
		for (int j = 0; j < col; j++) {
			max = Integer.MIN_VALUE;
			for (int i = 0; i < row; i++) {
				if (max < position[i][j]) {
					max = position[i][j];
					tempPos = j;
				}
			}
			if (min > max) {
				min = max;
				pos = tempPos;
			}
		}
		return pos;
	}


	public static void main(String[] args) {

		TreeMap<Integer, HashMap<String, Boolean>> buildings = new TreeMap<Integer, HashMap<String, Boolean>>() {
			{
				put(0, new HashMap<String, Boolean>() {
					{
						put("School", true);
						put("Gym", false);
						put("Studio", false);
					}
				});
				put(1, new HashMap<String, Boolean>() {
					{
						put("School", false);
						put("Gym", true);
						put("Studio", false);
					}
				});
				put(2, new HashMap<String, Boolean>() {
					{
						put("School", true);
						put("Gym", true);
						put("Studio", false);
					}
				});
				put(3, new HashMap<String, Boolean>() {
					{
						put("School", true);
						put("Gym", false);
						put("Studio", false);
					}
				});
				put(4, new HashMap<String, Boolean>() {
					{
						put("School", true);
						put("Gym", false);
						put("Studio", true);
					}
				});
			}
		};

		String[] req= {"School", "Gym", "Studio"};
		System.out.println(solve(buildings, req));

	}
}
