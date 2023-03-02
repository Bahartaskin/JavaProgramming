package day03_EscapeSequences;

public class Println_VS_Print {

    public static void main(String[] args) {

//println(): after printing the last character, appends a new line

        System.out.println("Hello Cydeo");
        System.out.println("How are you all today");
        System.out.println("-------------------------");

        //print(): after printing the last character, does not appends  new line

        System.out.print("Hello Cydeo");
        System.out.print("How are you all today");
        System.out.println("Java Programing");
        System.out.print("Wooden Spoon");
        System.out.println("I love java");

        //New line depends on previous print statement
    }
}
