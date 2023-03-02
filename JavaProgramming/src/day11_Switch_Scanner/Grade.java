package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'C'; // ==
        String grade = "";

        switch(ch){

            case 'A':
                grade = "Excellent";
               // System.out.println("Excellent");
                break;
            case 'B':
                grade = "Great Job";
               // System.out.println("Great Job");
                break;
            case 'C':
                grade = "Good";
              //  System.out.println("Good");
                break;
            case 'D':
                grade = "Passed";
               // System.out.println("Passed");
                break;
            case 'F':
                grade = "Failed";
              //  System.out.println("Failed");
                break;

            default:
                grade = "Invalid Grade";
               // System.out.println("Invalid Grade");



        }

        System.out.println("grade = " + grade);
    }

}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			otherwise: invalid
 */