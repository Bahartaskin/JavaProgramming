package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {

    // static: method can be called through its class name

    public static void main(String[] args) {
        String str = "aaaaaaaaaaabbbbbbbbbbbbbbccccccccccc";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        System.out.println("---------------------");

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);
    }

}
