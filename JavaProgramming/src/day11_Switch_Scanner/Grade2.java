package day11_Switch_Scanner;

public class Grade2 {


    public static void main(String[] args) {

        char ch = 'F';

        String grade = "";

        switch(ch){
            // if u want to apply same value ( grade = "Passed") in each case
            // to apply the or logic u can use this way in switch
            // because switch does not accept boolean ||
            // you can also write them on same block
            // case 'A':case 'B':case 'C':case 'D':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                grade = "Passed";
                break;
            case 'F':
                grade = "Failed";
                break;
            default:
                grade = "Invalid";


        }

        System.out.println(grade);

    }

}
/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */