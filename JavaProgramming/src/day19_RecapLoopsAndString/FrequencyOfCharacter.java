package day19_RecapLoopsAndString;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);// each character from the string
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //to fint the frequency of each character
                char eachChar = str.charAt(i);// each character of the string

                if (ch == eachChar) {
                    count++;
                }

                if (result.contains("+ch")){
                    continue;
                }

            }
            result += ch;
            result += count;
        }
    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */