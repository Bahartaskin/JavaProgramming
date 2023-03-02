package day10_NestedIfAndTernaries;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2==0){
            System.out.println("Even"); //String
        }else{
            System.out.println("Odd"); // String
        }

        // if all data types is same like String above u can use ternaries

        System.out.println("------------------");

       String result1 = (n%2==0)? "Even" : "Odd";

        System.out.println("result1 = " + result1);


        System.out.println("------------------");

        int age = 23;

        if(age>=21){
            System.out.println("Eligible"); //String
        }else {
            System.out.println("Not eligible"); //String
        }
// same result with ternaries
        //to make it reusable assign it into a variable
       String result2 = (age>=21)? "Eligible" : "Not eligible";

        System.out.println("result2 = " + result2);
        // or u can write in a println method
        System.out.println((age>=21)? "Eligible" : "Not eligible");
        //but to make it reusable assign it into a variable

        System.out.println("---------------------");

        int number = 100;

       String result3 = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println("result3 = " + result3);


    }




}
