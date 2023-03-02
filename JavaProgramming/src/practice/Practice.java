package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

      int [] arr = {14,1,84,97,1243,46};
      int tot=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                tot+=3;
            }else{
                tot+=10;
            }
            if (i%3==0){
                tot-=15;
            }
        }
        System.out.println(tot);
    }
}




