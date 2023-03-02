package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        //unique => only appear one time
        /*if the first and last index
         numbers of the character are same, then it's unique
         String str = "AABCCD";
         indexOf('A') ==> 0
         lastIndexOf('A') ==> 1 they are not same so not unique

         indexOf('B') ==> 2
         lastIndexOf('B') ==> 2 they are same so unique

         */

        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of str starting from 0
            char ch = str.charAt(i); // ch each character of str

        if(str.indexOf(ch)==str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same, then the character is unique
            result += ch;
        }



        }

        System.out.print(result);

    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */