package day22_MultiDimensionalArray;

public class ReverseTheSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");

        String secondWord = words[1];
        String reversed = "";

        for (int i = secondWord.length()-1; i >= 0; i--){
            reversed += secondWord.charAt(i);
        }
        System.out.println(reversed);
        System.out.println(words[0]+" "+reversed+" "+words[2]);

    }
}
/* Muhtar's solution
String[] words = sentence.split(" "); //[I, Love, Java]

        String reverse ="";

        for(int i = words[1].length()-1; i >= 0; i-- ){
            reverse += words[1].charAt(i);
        }

        System.out.println(reverse);

      //  sentence = sentence.replaceFirst(words[1], reverse);

        words[1] = reverse;
        System.out.println(Arrays.toString(words));

        String result = "";
        for (String word : words) {
           result += word +" ";
        }

        System.out.println(result);
 */