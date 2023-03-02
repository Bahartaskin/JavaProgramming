package day03_EscapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        /*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote
 */

        System.out.println("Java Python C#");
        System.out.println("Java \nPython C#"); //Python C# will be in a new line
        System.out.println("Java \nPython \nC#");

        System.out.println("---------------------------");

        System.out.println("Hello Cydeo How are you all today? It is nice to see you all! What class do we have next week?");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------");

        System.out.println("Java is Cool Programming Language");
        System.out.println("\tJava is Cool Programming Language"); //It is gonna begin with tab (space)

        System.out.println("----------------------------");

        System.out.println("/ \\"); //it will give me single back slash
        System.out.println("/ \\\\\\"); //if you need 3 back slashes you need to write 6 back slashes

        System.out.println("----------------------------");

        System.out.println("My favorite TV show is Friends");
        System.out.println("My favorite TV show is \"Friends\""); // it will let you to write " double quote
    }
}
