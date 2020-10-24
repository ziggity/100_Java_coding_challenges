package oneHundredProblems;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class ZachTest {

	public static void main(String[] args) {
		System.out.println(checker("tacocat"));				
	
	}
	private static boolean checker(String name) {

		StringBuilder nameBackwards = new StringBuilder(name);

		String inverseName = nameBackwards.toString();

		nameBackwards.reverse();

		nameBackwards.toString();

		System.out.println("Is " + inverseName + " the same as " + name);

		name.toString();

		if (inverseName.equals(name)) {

			return true;

		} else {

			return false;

		}

	}
		
//	    String clean = text.replaceAll("\\s+", "").toLowerCase();
//
//	    int length = clean.length();
//
//	    int forward = 0;
//
//	    int backward = length - 1;
//
//	    while (backward > forward) {
//
//	        char forwardChar = clean.charAt(forward++);
//
//	        char backwardChar = clean.charAt(backward--);
//
//	        if (forwardChar != backwardChar)
//
//	            return false;
//
//	    }
//
//	    return true;


	}




