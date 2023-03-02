package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        double by2 = number % 2;
        double by3 = number % 3;
        double by5 = number % 5;

        boolean isDivisible2 = by2 == 0;
        boolean isDivisible3 = by3 == 0;
        boolean isDivisible5 = by5 == 0;

        /* we can also do it like this;
        boolean divisibleBy2 =  number % 2 == 0; // if the remainder of a number divided by 2 is zero, then it's evenly divisible by 2
        boolean divisibleBy3 =  number % 3 == 0;
        boolean divisibleBy5 =  number % 5 == 0;
         */

        System.out.println(number + " is divisible by 2: " + isDivisible2);
        System.out.println(number + " is divisible by 3: " + isDivisible3);
        System.out.println(number + " is divisible by 5: " + isDivisible5);

        System.out.println("---------------------------------------");

        int year = 2000;

        boolean isLeapYear =  year % 4 == 0;

        System.out.println(year+" is leap year: " + isLeapYear);


    }
}
/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */