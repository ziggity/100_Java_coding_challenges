package oneHundredProblems;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be chessBoardCellColor(cell1, cell2) = true.
;

For cell1 = "A1" and cell2 = "H3", the output should be chessBoardCellColor(cell1, cell2) = false.


Hints

parseInt()
Input/Output

[time limit] 4000ms (js)
[input] string cell1
[input] string cell2
[output] boolean
true if both cells have the same color, false otherwise.

 */
public class ChessBoardCellColor {
	public static void main(String[] args) {
	

	}	
	
	public List createListWithEveryOtherElement(List list) {

        List names = Arrays.asList("Rhonda", "Marissa", "Alexis", "Devon", "Adrian", "Tiana");
        List everyOtherName = everyOtherElement(names);
        System.out.println(everyOtherName);
        System.out.println(names.get(4));
    }

    private static List everyOtherElement(List<String> names) {
        List<String> list = new ArrayList<String>();

        for(int index = 0; index < names.size(); index += 2) {
            list.add(names.get(index));
        }
        return list;
    }

	}