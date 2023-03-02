package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] number = {8,2,3,4,1,6};
        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i]<min){ // if there is an element in the array that's smaller
                min = number[i]; // smaller number will be assigned to the variable min
            }

        }
        System.out.println(min);
    }
}
