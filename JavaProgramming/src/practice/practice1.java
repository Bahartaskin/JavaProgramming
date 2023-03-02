package practice;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int a = n-1;
        String prefix = ""+str.charAt(a);

        System.out.println(prefix);

            if((str.contains(prefix))){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


    }
}
