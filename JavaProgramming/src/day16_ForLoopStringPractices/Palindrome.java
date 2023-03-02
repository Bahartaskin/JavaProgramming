package day16_ForLoopStringPractices;

public class Palindrome {

    public static void main(String[] args) {


        // if a word's reverse version and original version is same it is a palindrome
        // Anna ==> annA is a palindrome
        // to reverse a palindrome u need to use all lowercase/uppercase

        String word = "Level";
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);

        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);

    }
}
/*
 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
 */