package oneHundredProblems;
/*
 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be circleOfNumbers(n, firstNumber) = 7.



Hints

push()
Input/Output

[time limit] 4000ms (js)
[input] integer n
A positive even integer.

Guaranteed constraints:

4 ≤ n ≤ 20.

[input] integer firstNumber
Guaranteed constraints:

0 ≤ firstNumber ≤ n - 1.

[output] integer
 */
public class CircleOfNumbers {

	public static void main(String[] args) {

		System.out.println(circleOfNums(10, 2));
	}

	private static  int circleOfNums(int n, int firstNumber) {

        int h = n / 2;

        if (firstNumber - h < 0)
            return firstNumber + h;
        else
            return firstNumber - h;
    }

}
