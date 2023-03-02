package day17_While_DoWhile;

public class LoopPractice {

    public static void main(String[] args) {

        // print me 1 to 10

        for (int i =1; i <=10; i++){ // preferred
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        // print me 1 to 10
        int j = 1;
        while (j<=10){
            System.out.println(j);
            j++;

            System.out.println("-----------------------------");

            // print me 1 to 10

            int k = 1;

            do{
                System.out.println(k);
                k++;
            }while (k<=10);
        }
    }
}
