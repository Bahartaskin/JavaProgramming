package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        double length = 7.5;
        double width = 9.0;
        double area = length * width;
        double perimeter = 2 * (length + width);

// I can write double length = 8; output will be 8.0

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("width = " + width);
        System.out.println("length = " + length);
    }
}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */