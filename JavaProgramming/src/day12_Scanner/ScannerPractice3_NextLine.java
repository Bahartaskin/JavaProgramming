package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language");
        String programming = input.nextLine();

        System.out.println("Enter Your age");
        int age = input.nextInt();

        input.nextLine(); // capture the Entre key that user pressed for nextInt()


        System.out.println("enter your School name: ");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
