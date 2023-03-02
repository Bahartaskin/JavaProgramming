package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; //A

        for (int i = 0; i < str.length() ; i++) {
            String ch = "" + str.charAt(i); // to make char to string add empty string
            // if the result already contains the character
            if(result.contains(ch)){
                continue; // skip
            }
            result += ch; // result = string and ch = string
        }

        System.out.println(result);
    }
}
