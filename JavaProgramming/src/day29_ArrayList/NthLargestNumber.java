package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
/*
        // if you want to find second max num
        list.removeIf(e -> Collections.max(list)==e);// removed first max number
        int max = Collections.max(list);
        System.out.println(max);

        // if you want to find third max num
        list.removeIf(e -> Collections.max(list)==e); // removed second max number
        max = Collections.max(list);
        System.out.println(max);
*/
        //OR you can use loop to find third or fourth.. max num
        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);

        System.out.println(max);



    }
}
