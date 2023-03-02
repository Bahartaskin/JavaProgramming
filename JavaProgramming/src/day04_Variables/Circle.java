package day04_Variables;

public class Circle {
    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 3.5;
        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;
        double diameter = 2 * radius;


        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("diameter = " + diameter);
    }
}
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */