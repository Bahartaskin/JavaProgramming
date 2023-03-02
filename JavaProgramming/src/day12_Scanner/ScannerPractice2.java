package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //System.out.println("Enter True or False");
        //boolean result = input.nextBoolean();

        System.out.println("Enter your name: ");
        String name = input.next(); // Java Programing
        System.out.println("name = " + name); //Java
        // next method only reads to the space thats why output will be Java not Java Programing
        // use this method if you are gonna enter only one word
        input.close();
    }

}
