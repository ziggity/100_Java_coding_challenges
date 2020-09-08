package oneHundredProblems;

import java.util.ArrayList;

//Given a rectangular matrix of characters, add a border of asterisks(*) to it.
//
//Example
//
//For
//
//picture = ["abc",
//       "ded"]
//the output should be
//
//addBorder(picture) = ["*****",
//                  "*abc*",
//                  "*ded*",
//                  "*****"]
//Hints
//
//concat()
//unshift()
//push()
//Input/Output
//
//[time limit] 4000ms (js)
//[input] array.string picture
//A non-empty array of non-empty equal-length strings.
//
//Guaranteed constraints:
//
//1 ≤ picture.length ≤ 5,
//
//1 ≤ picture[i].length ≤ 5.
//
//[output] array.string
//The same matrix of characters, framed with a border of asterisks of width 1.

//ArrayList is unique in its naming standards. Here are the equivalencies:
//
//Array.push    -> ArrayList.add(Object o); // Append the list
//Array.pop     -> ArrayList.remove(int index); // Remove list[index]
//Array.shift   -> ArrayList.remove(0); // Remove first element
//Array.unshift -> ArrayList.add(int index, Object o); // Prepend the list

//push()    -> LinkedList.addLast(); // Or just LinkedList.add();
//pop()     -> LinkedList.pollLast();
//shift()   -> LinkedList.pollFirst();
//unshift() -> LinkedList.addFirst();
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class AddABorder {

		static final String[] sc = {"WVERTICALL"
	     , "ROOAFFLSAB"
	     , "ACRILIATOA"
	     , "NDODKONWDC" 
	     , "DRKESOODDK" 
	     , "OEEPZEGLIW" 
	     , "MSIIHOAERA" 
	     , "ALRKRRIRER" 
	     , "KODIDEDRCD" 
	     , "HELWSLEUTH"};
		public static void main (String[] args) throws java.lang.Exception
		{
			try{
				int row = 10;
				int col = 10;
				char[][] puzzle = new char[row+2][col+2];
			    String getChar = "";
			    for (int i=0; i<row+2; i++){
	 
				    if (i>0 && i<row+1) getChar = sc[i-1];
				    for(int j = 0;j<col+2; j++){
				        if (i % (row + 1) == 0 || j % (col + 1) == 0) {
				            puzzle[i][j] = '#';
				        } else {
				            puzzle[i][j] = getChar.charAt(j-1);
				        }
				    }
				}
				for (int i=0; i<row+2; i++){
					for (int j=0; j<col+2; j++){
						System.out.printf("%c ", puzzle[i][j]);
					}
					System.out.println();
				}
				/* PRE INCREMENTING ROW/COL */
				row += 2;
				col += 2;
				char[][] puzzle2 = new char[row][col];
			    for (int i=0; i<row; i++){
	 
				    if (i>0 && i<row-1) getChar = sc[i-1];
				    for(int j = 0;j<col; j++){
				        if (i % (row - 1) == 0 || j % (col - 1) == 0) {
				            puzzle2[i][j] = '#';
				        } else {
				            puzzle2[i][j] = getChar.charAt(j-1);
				        }
				    }
				}
				for (int i=0; i<row; i++){
					for (int j=0; j<col; j++){
						System.out.printf("%c ", puzzle2[i][j]);
					}
					System.out.println();
				}
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}

