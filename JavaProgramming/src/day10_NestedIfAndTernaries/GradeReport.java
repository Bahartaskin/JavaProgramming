package day10_NestedIfAndTernaries;

public class GradeReport {

    public static void main(String[] args) {

        int score = 72;

        if(score>=0&&score<=100){ // if the score is valid


            //because we said the compiler that score must be <=100
            // that is why we don't need to write it again in the else if statement below

            if(score>=90) { // <=100 is implicitly given

                System.out.println("Excellent");
            } else if (score>=80) { //<90 is implicitly given
                System.out.println("Great");
            } else if (score>=70) {//<80 is implicitly given
                System.out.println("Good");
            } else if (score>=60) {//<70 is implicitly given
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        }else{ // if the score does not valid

            System.out.println("Invalid");
        }

        System.out.println("------------------------------");

        // solution2: use ternaries only

     /*  String result = (score>=0&&score<=100)?  (score>=90)? "Excellent"
                :(score>=80)? "Great" :(score>=70)? "Good"
                :(score>=60)? "Passed" : "Failed" :"Invalid";

        System.out.println(result);

        System.out.println("--------------------------------");
*/
        //solution3: mix it up
        // if you have a nested if mixing is a better way

        String result2 = "";
        if(score>=0&&score<=100){

        result2 = (score>=90)? "Excellent"
                :(score>=80)? "Great" :(score>=70)? "Good"
                :(score>=60)? "Passed" : "Failed" ;
        }else{ // if the score does not valid

            System.out.println("Invalid");
        }

        System.out.println(result2);
    }
}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */