package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {

            System.out.println(i+"");

            if (i == 'F'){
                break; // exits the loop
            }
        }

        System.out.println();
        System.out.println("------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        while (true){
            System.out.println("Enter a number:");
            num = scan.nextInt();

            if (num<0){
                break;
            }
        }

    }
}
