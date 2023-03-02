package day19_RecapLoopsAndString;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0; // represents the frequency of this char ch

            for (int i = 0; i < str.length(); i++) { // inner loop: compares the character that outer loop picked
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }// when the inner loop finished finding the frequency the if statement decide if it is unique or not

            if (count==1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
          /*  also can use that
            if (count != 1){
                continue;
            }
*/
        }
    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */