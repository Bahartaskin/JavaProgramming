package day11_Switch_Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 78;
        String word = "";


        if(number>=0&&number<=9) {

          word =(number==0)? "Zero" :(number == 1) ? "One" : (number == 2) ? "Two" :(number==3)? "Three"
                    :(number==4)? "Four" :(number==5)? "Five" :(number==6)? "six"
                    :(number==7)? "Seven" :(number==8)? "Eight" : "Nine";

        }else{
            word = "Invalid Number";
        }

        System.out.println(word);

    }

}
/*
Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */