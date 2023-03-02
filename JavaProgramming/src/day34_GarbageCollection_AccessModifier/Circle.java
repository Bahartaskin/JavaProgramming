package day34_GarbageCollection_AccessModifier;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name;

    public static ArrayList<Integer> numbers;
// when you have a static variable create a static block to set them, it is the better way

    //public static Sheet sheet ;

    public Circle(double radius){ // never use contractor to initialize/set static variable
        this.radius = radius;
    }//constructor is for setting instance variables, NOT static variables

    static {// to set static variables use static block
        //use it whenever you need to set a static variable
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

     /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/

}
