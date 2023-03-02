package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        int num[] = new int[2*nums.length];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();



            for (int each : nums) {
                num[i]=each;
            }

        }

        System.out.println(Arrays.toString(num));

    }

}
