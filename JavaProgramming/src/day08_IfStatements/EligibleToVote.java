package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {


        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // true


        // Eligible
        if(isEligible){ // since it is true, this one will be executed
            System.out.println("Eligible");
        }

        // Not Eligible
        if(!isEligible) { // !true == not true == false
            System.out.println("Not Eligible");
        }
    }
}
