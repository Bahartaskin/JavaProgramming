package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        // username: "Cydeo"
        //password: "Cydeo123"

        Scanner scan = new Scanner(System.in);
        System.out.println("Username:");
        String userName = scan.next();
        System.out.println("Password:");
        String password = scan.next();



        if (userName.equals("Cydeo")&&password.equals("Cydeo123")){

            System.out.println("Logged in");
        }else{
            int attempt = 3;
            while ( !(userName.equals("Cydeo")&&password.equals("Cydeo123")) && attempt>0){ // while the credentials are invalid, and user has attempts to reenter
                System.out.println("Incorrect username or password, Please re-enter");
                System.out.println("Username:");
                userName = scan.next();
                System.out.println("Password:");
                password = scan.next();

                attempt--;

            }

            if(userName.equals("Cydeo")&&password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }

scan.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */