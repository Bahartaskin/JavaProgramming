package day10_NestedIfAndTernaries;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        //nested if: Pre-condition
        //first we check for pre statement
        if(score>=0&&score<=100) { // meaning; if score is valid

            //nested is includes the if statement in {}

            if (score >= 60) { // if student pass the exam
                System.out.println("Passed");
            } else { // if the student fail the exam
                System.out.println("Failed");
            }

        }else{ // if the score is not valid (like score = 400)
            System.out.println("Invalid");
        }

        System.out.println("_________________________________________________");

        int age = 25;

        boolean hasId = true;

        if(hasId) { // if the person has ID

            if (age >= 21) { // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { // ıf the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else { // if the person does not have an ID

            System.out.println("");


        }

        System.out.println("___________________________________");

        int number = 5;

        if(number>=1&&number<=7){ // if the number is valid ( between 1-7)

            String day;

            if(number==1){
                // System.out.println("Monday");
                day = "Monday";
            }else if(number==2){
                //System.out.println("Tuesday");
                day = "Tuesday";
            }else if(number==3){
                // System.out.println("Wednesday");
                day = "Wednesday";
            }else if(number==4){
                //System.out.println("Thursday");
                day = "Thursday";
            }else if(number==5){
                // System.out.println("Friday");
                day = "Friday";
            }else if(number==6){
                //System.out.println("Saturday");
                day = "Saturday";
            }else {
                //System.out.println("Sunday");
                day = "Sunday";

            }


        }else{ //if the number is not valid
            System.out.println("Invalid Number");
        }


    }

}
