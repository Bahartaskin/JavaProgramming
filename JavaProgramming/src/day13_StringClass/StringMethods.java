package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

       /* char tenthChar = word.charAt(9);
        out of range
        System.out.println("tenthChar = " + tenthChar);*/

        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";

        // to know how many character do u have (total character)
        //length(): returns the total number of characters. returns int

        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt( s1.length()-1 ); // if you subtract -1 from the total number s1.length() u will find last character.
        // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);

        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println("s = " + s);

        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);



    }
}
