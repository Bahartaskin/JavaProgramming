package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {

//There is a blank space after last sentence like (after this is java)
        System.out.println("Knock Knock");
        System.out.println("Who is this?");
        System.out.println("This is java");

        System.out.println("-------------------");

//There is NOT a blank space after last sentence like ( after knock knock)
        System.out.print("Knock Knock");


        System.out.println("Hello evryone, how are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");

        System.out.println("----------------------------------");
// if you want to read it here easily and see on the console (as an output) in the same line you can use print
        System.out.print("Hello Everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print(", and next week we will learn Variables");

        System.out.println();


    }
}
