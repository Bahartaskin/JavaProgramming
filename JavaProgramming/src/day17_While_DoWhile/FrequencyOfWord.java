package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJava";
        int frequency = 0;
        for (int i = 0; i < str.length() -3 ; i++) { // we added -3 to the length because when we add i+4 some index numbers are gonna go out of range to prevent that we are subtract -3 (last index is included) in loop
          String eachSub = str.substring(i, i+4); // i+4 because Java has 4 letter and we added 4 to beginning index of the str
        if(eachSub.equals("Java")){
            frequency++;
        }

        }

        System.out.println(frequency);
    }

}
/*
2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */