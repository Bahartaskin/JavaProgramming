package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("10" + 20); //1020 concatenation
        System.out.println(10 + 20); //30 addition
        System.out.println(100 - 50); // 50 subtraction
        System.out.println(10 * 6); // 60 multiplication
        System.out.println(10 / 2); // 5 division

        /* Division:
                 in math 10/4 = 2.5

                 in java 10/4 = 2 (if both number is integer, you will be getting integer)
                 in java 10.0/4 = 2.5 (u can do this)
                 in java 10/4.0 = 2.5 (or this)
                 in java 10.0/4.0 = 2.5 (or this one)

         */

        System.out.println(100.0/3); // 33.333333333333336
        System.out.println(100/3.0); // 33.333333333333336
        System.out.println(100.0/3.0); // 33.333333333333336

                  //casting implicitly

        int a = 100;
        double b = a/3; // 33.0 --> integer/integer

        System.out.println(b);

        double c = (double)a/3; // 33.333333333333336 --> converted to a decimal

        System.out.println(c);


    }
}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */