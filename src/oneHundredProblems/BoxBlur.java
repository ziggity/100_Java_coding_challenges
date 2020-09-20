package oneHundredProblems;

import java.awt.List;
import java.util.ArrayList;

/*
 * Last night you had to study, but decided to party instead. Now there is a black and white photo of you that is about to go viral. You cannot let this ruin your reputation, so you want to apply box blur algorithm to the photo to hide its content.

The algorithm works as follows: each pixel x in the resulting image has a value equal to the average value of the input image pixels' values from the 3 × 3 square with the center at x. All pixels at the edges are cropped.

As pixel's value is an integer, all fractions should be rounded down.

Example

For

image = [[1, 1, 1], 
        [1, 7, 1], 
        [1, 1, 1]]
the output should be boxBlur(image) = [[1]].

In the given example all boundary pixels were cropped, and the value of the pixel in the middle was obtained as (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) / 9 = 15 / 9 = rounded down = 1.

Hints

push()
Math.floor()
Input/Output

[time limit] 4000ms (js)
[input] array.array.integer image
An image is stored as a rectangular matrix of non-negative integers.

Guaranteed constraints:

3 ≤ image.length ≤ 10,

3 ≤ image[0].length ≤ 10,

0 ≤ image[i][j] ≤ 255.

[output] array.array.integer
A blurred image.
 */
public class BoxBlur {

	public static void main(String[] args) {
		int[][] image = {{1, 1, 1}, 
		                 {1, 7, 1}, 
		                 {1, 1, 1}};
		System.out.println(boxBlur(image));
	}

	private static ArrayList boxBlur(int[][] image) {
		ArrayList result = new ArrayList<>();
		
		for(int y = 0; y < image[y].length -2; y++) {
			System.out.println(y);
			ArrayList line = new ArrayList<>();
			for(int x = 0; x < image[y].length-2; x++) {
				int sum = 0; 
				int count = 0;
				for(int a = y; a < y + 3; a++) {
					for(int b = x; b < x+3;b++) {
						if((b  < 2) && (a < 2)) {
							System.out.println(image[a][b]);
							sum += image[a][b];
						}
						count++;
					}
				}
				line.add(Math.floor(sum/count));
			}
			result.add(line);
		}
		return result;
	}

}
