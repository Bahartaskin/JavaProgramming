package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
// if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median


        boolean aMedian = ( a > b && a < c) || (a < b && a > c);
        boolean bMedian = ( b > a && b < c) || (b < a && b > c);
        boolean cMedian = (c > a && c < b)  || (c < a && c > b);
// or you can write boolean cMedian = !aMedian && !bMedian;

        /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

        if(aMedian){
            System.out.println(a+ " is the median number");
        }

        if (bMedian) {
            System.out.println(b+ " is the median number");
        }

        if (cMedian) {
            System.out.println(c+ " is the median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */