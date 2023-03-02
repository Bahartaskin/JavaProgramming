package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        for(int i = 0; a;){ // because it is false it doesn't get executed
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("-------------------------------");

        while(a){ // it is not gonna executed because it is false
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("-------------------------------");


        do{ // first think will execute the do block after printing Wooden Spoon -- do-while loop then check the while condition
            System.out.println("Wooden Spoon -- do-while loop");
        }while(a); // if condition is true do block will execute again

    }
}
