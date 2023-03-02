package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
// if you're using the nextLine method after the other methods u need to take the enter key out.
        input.nextLine(); //before using nextLine u need to get the enter key.

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        // because we use nextLine after the double (or any other method)
        // we need to get enter key

        input.nextLine();// getting the enter key

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */