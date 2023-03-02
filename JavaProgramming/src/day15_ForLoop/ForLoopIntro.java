package day15_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

// to print it 10 times by myself
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("--------------------------");

        // we know the exact number of repeating (10 times) we can use for loop to take care of repeating.

        for(int i = 1; i<=10; i++){ //i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
            System.out.println("Hello World!"); //i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }
    }
}
