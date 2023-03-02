package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);// it will swap first element with last element

        System.out.println(numbers);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        //move all the 0 at the end of the arraylist
        int size = list.size(); // find the size
        list.removeAll(Arrays.asList(0)); // remove zeros
        int newSize = list.size(); // size without zeros
        int totalNumOfZeros = size-newSize; // how many zeros did we remove
        for (int i = 0; i < totalNumOfZeros ; i++) { // add zeros to list
            list.add(0);
        }
        System.out.println(list);

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each!=0){
                result.add(each);
            }
        }
        for (Integer each2 : list2) {
            if (each2==0){
                result.add(each2);
            }
        }

        System.out.println(result);

        System.out.println("-----------------------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {// to get each character
            chars.add(str.charAt(i)); // to add each character to the chars arraylist
        }

        ArrayList<Character> letters = new ArrayList<>(chars); // add all the characters
        letters.removeIf(e -> !Character.isLetter(e)); //remove the characters that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars); // add all the characters
        digits.removeIf(e->!Character.isDigit(e)); //remove the characters that are not digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        //OR
        //specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );
        System.out.println("specialChar = " + specialChar);


    }
}
