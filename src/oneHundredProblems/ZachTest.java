package oneHundredProblems;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ZachTest {

	public static void main(String[] args) {
						
				List<Integer> list = new ArrayList<Integer>();
				list.add(21);
				list.add(22);
				list.add(23);
				list.add(24);
				list.add(25);
				
				
				List resultArray = createListWithEveryOtherElement(list);
				System.out.println(resultArray);
			
				HashMap<String, String> people = new HashMap<String, String>();
				people.put("John", "Smith");
				people.put("Steve", "Hicks");
				people.put("Angie", "Johnson");
				people.put("Sam", "Prasad");
				people.put("Adam", "Jackson");
				people.put("Angel", "Garcia");
				List resultList = getValuesFromMapWhereKeyStartsWithA(people);
				System.out.println((resultList));
			}
			
			private static ArrayList<String> getValuesFromMapWhereKeyStartsWithA(HashMap<String, String> people) {
				
				String str1 = "";
				
				ArrayList<String> mapReadList = new ArrayList<>();
		        for (String x: people.keySet())	{
		        	str1 = people.get(x);
		       	if (x.startsWith("A"))  {
		        		mapReadList.add(str1);
		        	}
		        }
		        return mapReadList;
			}
			public static List createListWithEveryOtherElement(List list) {
				ArrayList<Integer> arrayList = new ArrayList<>();
		        for (int i = 0; i < list.size(); i+=2)         {
		            if (i > 0)	{
		                arrayList.add((Integer) list.get(i));
		            }
		        }
		        return arrayList;
			}	
		
}




