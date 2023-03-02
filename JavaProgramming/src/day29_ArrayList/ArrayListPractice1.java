package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        //to convert array to the ArrayList
        //if you have non-primitive array Arrays.asList(countries) pass the name
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(each -> each.length()>=10);

        //to convert ArrayList back to array with toArray method
       countries = list.toArray(new String[0]); // when you convert ArrayList to array you can assign your old array
        //(new String[0]) 0 is not important any number u can give, it will change according to list(ArrayList) size/capacity



    }
}
