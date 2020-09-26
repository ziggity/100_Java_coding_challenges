package oneHundredProblems;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;



public class ZachTest {



public static void main(String[] args) {



    List<String> list = Arrays.asList("Hello", "World!", "hi", "13301", "11010");



System.out.print(createListWithEveryOtherElement(list));

}

     public static  List createListWithEveryOtherElement(List list) {

        List<String> resultList = new ArrayList<String>();

         for (int i = 0; i < list.size(); i= i+2) {

         

         //System.out.println(list.get(i));

         resultList.add((String) list.get(i));

         

         }

         

         

System.out.println("0" + resultList.get(0));

System.out.println("1" + resultList.get(1));

System.out.println("2" + resultList.get(2));



//System.out.println(resultList.remove(resultList.size()-1));

if(resultList.size() == list.size()/2 ) {

return  resultList;

}

else {

resultList.remove(resultList.size()-1);

}  

    

return  resultList;



    }



}