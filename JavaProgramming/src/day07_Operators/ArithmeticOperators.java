package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 70;
        int num2 = 9;
        double division = (double)num1/num2; //division variable contains the result of num1 divided by num2
        int reminder = num1%num2; // remainder variable contains the remainder of num1 divided by number


        System.out.println("division = " + division);
        System.out.println("reminder = " + reminder);
        System.out.println(num1+ " divide by "+ num2 + " is equal to " + division + " with a remainder of " +reminder);


        // whats the remainder of 25 divided 4:

        System.out.println( 25 % 4 );

        //whats the remainder of 25 divided 5:
        System.out.println(25 % 5);

    }
}
