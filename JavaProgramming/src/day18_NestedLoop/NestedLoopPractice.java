package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter our age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("Invalid entry Please re enter");
                age = scan.nextInt();
            }

            System.out.println("Would your like to continue");
            String a = scan.next().toLowerCase();
            while(!(a.equals("yes")||a.equals("no"))){
                System.out.println("Invalid Entry, Please re enter");
                System.out.println("Would your like to continue");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }
        scan.close();
    }
}
