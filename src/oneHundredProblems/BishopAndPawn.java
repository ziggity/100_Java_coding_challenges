package oneHundredProblems;

import java.util.HashMap;

/*
 * Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move,



Example

For bishop = "a1" and pawn = "c3", the output should be bishopAndPawn(bishop, pawn) = true.


Hint

parseInt()
Input/Output

[time limit] 4000ms (js)
[input] string bishop
Coordinates of the white bishop in the chess notation.

[input] string pawn
Coordinates of the black pawn in the same notation.

[output] boolean
true if the bishop can capture the pawn, false otherwise.
 */
public class BishopAndPawn {

	public static void main(String[] args) {
		String x1 = "a1";
		String x2 = "c3";
		System.out.println(bishopAndPawn(x1, x2));
	}

private static boolean bishopAndPawn(String x1, String x2) {
	HashMap<String, Integer> board = new HashMap<String, Integer>();
	board.put("a",1);
	board.put("b",2);
	board.put("c",3);
	board.put("d",4);
	board.put("e",5);
	board.put("f",6);
	board.put("g",7);
	board.put("h",8);
	char bishopX;
	char bishopY;
	char pawnX;
	char pawnY;
	char[] newX1 = x1.toCharArray();
	char[] newX2 = x2.toCharArray();
	bishopX = newX1[0];
	int bishopFX = board.get(bishopX);
	bishopY = newX1[1];
	int bishopYX = (board.get(bishopY));
	
System.out.println(bishopYX + " " + bishopFX);
	pawnX = newX2[0];
	pawnY = newX2[1];
	
	int pawnFX = board.get(pawnX);
	int pawnYX = (board.get(pawnY));

	System.out.println(bishopFX  +" "+ bishopYX + " " + pawnFX +" " + pawnYX);
	if(bishopFX + bishopYX == pawnFX + pawnYX || bishopFX + pawnYX == pawnFX + bishopYX) return true;
	System.out.println("bishop " + bishopX + " " + bishopY);
	return false;
}
}