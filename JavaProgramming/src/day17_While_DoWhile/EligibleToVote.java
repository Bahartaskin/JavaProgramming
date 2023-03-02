package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt(); // valid age 1 to 120

        while (!(age>=1&&age<=120)){
            System.out.println("Invalid entry, Please re-enter:");
            System.out.println("Enter your age:");
            age = scan.nextInt();
        } // when the valid age provided loop gets exit

        System.out.println("Are you a US citizen? yes/no:");
        String answer = scan.next();

        while( !(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, Please re-enter:");
            System.out.println("Are you a US citizen? yes/no:");
            answer = scan.next(); // if you dont use equalsIgnoreCase u can add here .toLowerCase also
        }

        if(age>=18 &&answer.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

    }
}
