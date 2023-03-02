package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        // Long n1 =num1; --> cannot assign to another primitive like int to long
        Integer n1 = num1; //autoboxing --> covert primitives to the objects

        // after autoboxing u can use it in data structures like collection and map
        // casting implicitly

        int num2 = n1;  //unboxing --> convert objects to the primitive

        System.out.println("------------------------------------");

        Integer integerValue = 100;
        // while doing unboxing u can cast/convert to any primitive like integer to long
        long longValue = integerValue;

        Byte b1 = 25; //Byte wrapper class I can convert it to..

        byte a1 = b1; // byte
        short a2 = b1; // short
        int a3 = b1; // int
        long a4 = b1; //long

        //as long as it is in the range you can convert it to any primitive

        System.out.println("------------------------------------");

        int num3 = 200;
        // Long l2 = num3;
        //  Double d1 = num3;

        Integer num4 = num3; //autoboxing


        System.out.println("------------------------------------");

        Integer z = 900;
        Integer y =z;

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};

    }
}
