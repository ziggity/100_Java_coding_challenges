package oneHundredProblems;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class testHW{

	public static void main(String[] args) {
		
		public List createListWithEveryOtherElement(List list) {

	        List<String> names = Arrays.asList("Rhonda", "Marissa", "Alexis", "Devon", "Adrian", "Tiana");
	        List<String> everyOtherName = everyOtherElement(names);
	        System.out.println(everyOtherName);
	        System.out.println(names.get(4));
	    }

	    private static List<String> everyOtherElement(List<String> names) {
	        List<String> list = new ArrayList<String>();

	        for(int index = 0; index < names.size(); index += 2) {
	            list.add(names.get(index));
	        }
	        return list;
	    }

					

		}
}

	}