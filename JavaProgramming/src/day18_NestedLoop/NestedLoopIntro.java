package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("---------------------------");

        // Nested loop:  loop inside another loop (inner & outer loops)
        //one iteration of the outer loop, executes all the iteration of the inner loop

        for (int j = 0; j < 4 ; j++) { //j: 0,1,2,3
//when the first loop executed for the first time second loop will execute 5 times
            //when the first loop executed for the second time second loop will execute 5 more times
            //when the first loop executed for the third time second loop will execute 5 more times
            //when the first loop executed for the fourth time second loop will execute 5 more times
            for (int i = 0; i < 5 ; i++) { //i: 0,1,2,3,4
                System.out.println("Wooden Spoon");
            }

        }
    }
}
