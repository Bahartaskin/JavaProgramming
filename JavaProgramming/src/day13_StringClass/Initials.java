package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f+"."+l ; // to make it concatenation we add an  "" string in it

        System.out.println("initial = " + initial);


    }
}
/*
Task:
	initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S
 */