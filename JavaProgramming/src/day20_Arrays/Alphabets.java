package day20_Arrays;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] alphabets = new char[26];  //Z~A

        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */

        /*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
*/

        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++) {
            alphabets[i]=ch;
            ch--;
        }

        System.out.println(Arrays.toString(alphabets)); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array

    }
}
