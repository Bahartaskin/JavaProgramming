package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

       int num = Integer.parseInt(str); // return int so I can assign to an int

        System.out.println(num+1); // addition --> 124
        System.out.println(str+1); // concatenation --> 1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE; // max value of a specific wrapper class
        int min = Integer.MIN_VALUE; // min value of a specific wrapper class

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE; // max value of a specific wrapper class (any primitive type)
        long min2 = Long.MIN_VALUE; // min value of a specific wrapper class (any primitive type)

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);


        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer unboxing because valueOf gives us wrapper class and if wrapper class convert primitive it is unboxing

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");


        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1); // if it is not letter or digit it is special character

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);
    }
}
