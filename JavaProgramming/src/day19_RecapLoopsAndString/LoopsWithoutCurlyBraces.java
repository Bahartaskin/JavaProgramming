package day19_RecapLoopsAndString;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("Batch 10");
        System.out.println("Cydeo");
        // u can use loop without curly braces but u cannot give more than one statement without curly braces

        System.out.println("-------------------------------------");

        for (int j = 0; j < 5; j++) {
            System.out.println("Batch 10");
            System.out.println("Cydeo");
        }// if u have 2 statement u need to use curly braces

    }
}
