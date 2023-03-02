package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        // I cannot create a ArrayList from the string directly
        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

         // I can split (str.split("")) split string convert to string array so u can convert it ArrayList

       // ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        //OR
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);

        //to find unique characters of a string u can still apply the collections methods
        String unique = "";

        for (String each : list) {
           int frequency = Collections.frequency(list,each);
           if (frequency==1){
               unique+=each; // string does not have add method so we use += concatenation
           }
        }
        System.out.println("unique = " + unique);
    }
}
