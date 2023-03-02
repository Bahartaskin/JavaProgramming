package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // if you know the size only you know how many elements but you dont know the  elements
        // create a variable that is capable enough to contain 5 names

        String[] myGroup = new String[5]; //String array with 5 range
       // String myGroup[]; --> also fine
      //  System.out.println(myGroup); //wrong way of printing the array gives us hashcode
        System.out.println(Arrays.toString(myGroup)); //[null, null, null, null, null]
        // null means no object was given so we need to assign names to it
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
       // myGroup[5] = "Muhtar";// this one gives error because array can only 5 as size

        System.out.println(Arrays.toString(myGroup));


        System.out.println("--------------------------------");

        // if you know the size and the elements also, you know how many elements and you also know what those elements are

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

    }
}
