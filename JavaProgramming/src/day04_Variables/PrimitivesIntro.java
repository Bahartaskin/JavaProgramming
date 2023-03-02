package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args){

        // age: 38 years old

        byte age = 38;

        // Weight: 160 pounds
        // we cannot use byte because 160 bigger value then byte value
        // 160 out of the byte range

        short weight = 160; // 160 is within the range of short

        // salary: 100000$
        // salary is out of the short and byte range

        int salary = 100000; // int is the preferred data type

        // u cannot use , in the variables like 10,000
        //but u can use _ like 10_000

        int fee = 10_000;

         // when u use long u have to add L at the end
        // because it is taken as an int that is why we should specify

        long asset = 3_333_333_333L;

        // tax: 0.26 (decimal number)
        // if you're using float u need to add F at the end

        float tax = 0.26F;

        // double is the preferred

        // char for writing single character
        // to write # one way "char ch1 = '#'"

        char ch1 = '#';

        // to write # another way you can look into ASCII table"char ch2 = 35;"

        char ch2 = 35;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        char gender = 'F'; // single character
        char grade = 'A';
        char yesNo = 'Y';

        // every single character represented by a number in java

        // boolean uses for "True or False"

        boolean isEmployeed = true;
        boolean isMarried = false;

        int a = 100;
        int b = 200;

        boolean aIsGreaterThanB = a > b; // give me False

        System.out.println(aIsGreaterThanB);

        // String for more than one character, and we need to use " " quotation
        // String is a class, so we use "upper case S"
        String name = "Bahar";

/*
Variable names should be camel case like firstName
you can only use _ and $ in the name
like first_name
like firstName$
we cannot use space in name
we cannot start with the digits
we cannot use Java reserved words
 */


    }
}
