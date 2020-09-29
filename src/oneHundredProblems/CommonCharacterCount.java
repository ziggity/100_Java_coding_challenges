package oneHundredProblems;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonCharacterCount {

	public static void main(String[] args) {

		System.out.println(commonCharCount("AADBCC", "ADCAA"));
		System.out.println(commonCharCount("aabcc", "adcaa"));
	}

	private static int commonCharCount(String string, String string2) {
		ArrayList<Character> list = new ArrayList<>();
		char c;
		int pairs = 0;
		for(char i : string.toCharArray()) list.add(i);
		for(int i = 0; i < string2.length(); i++) {
			c = string2.toCharArray()[i];
			if(list.contains(c)) {
				list.remove(list.indexOf(c));
				pairs++;
			}
		}
		return pairs;
	}

}