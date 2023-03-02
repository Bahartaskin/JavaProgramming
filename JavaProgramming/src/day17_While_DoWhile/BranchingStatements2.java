package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {
            if(i == 'C'){
                continue; // skip
            }
            System.out.println(i); //A B D E
        }

        System.out.println("-------------------------------------");
        // print all even numbers 1 ~ 10 (skip the odd numbers)

        for (int i = 1; i <=10 ; i++) {
            if(i%2!=0){ // (to skip) not divisible by 2
                continue; // skip
            }
            System.out.println(i);
        }


        System.out.println("-------------------------------------");
        // print all odd numbers 1 ~ 10 (skip the odd numbers)

        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){ // (to skip) divisible by 2
                continue; // skip
            }
            System.out.println(i);
        }
    }
}
