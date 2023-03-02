package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@ #$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of str
            char ch = str.charAt(i); // ch: every single character that we have in str
            if(ch >= '0' && ch <='9'){ // if character is between '0' to '9' it is digit
                digits += ch;
            } else if (ch >= 'A'&&ch<='Z'||ch >= 'a'&&ch<='z') { // if the character between 'A' to'Z' or 'a' to'z' it is letter
                letters += ch;
            }else{ // if the character is neither digit nor letter, then it is special character
                if(ch != ' ') { // if the special character is not a space
                    specialChars += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
