package day39_Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);

        /*
        we use private access modifier, but we can use the instance variable via getter and setter
        so what is the point to make it private if we can still get it or set it
        because when we use public access modifier we can not add to our instance variable
        conditions or restrictions. we have no control over our instance variable when we use public
        setter and getter ( encapsulation ) help me to check if given data is valid or not
         */

        square.setSide(15);

        System.out.println(square);

        System.out.println("--------------------------------------");

        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("------------------------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle);

        System.out.println(circle.getName());

    }



}
