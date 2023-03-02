package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty(); //true
        System.out.println("r = " + r);

        String str1 = " ";//it has white(unnecessary) space so not empty
        boolean r1 = str1.isEmpty();//false
        System.out.println("r1 = " + r1);

        String str2 = " ";//it has white (unnecessary) space so it is blank
        boolean r2 = str2.isBlank();//true
        System.out.println("r2 = " + r2);


        System.out.println("-----------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false because case sensitivity
        // if you want to ignore case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2));// true because this method ignore the case sensitivity

        // Yes, YES, yEs, yES, YEs...

        System.out.println( "yEs".equalsIgnoreCase("Yes") );

        System.out.println("-----------------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCsharp = sentence.contains("C#");// check if these characters C# included in the sentence
        // it will give you false (Boolean) because the sentence does not include C#
        System.out.println("hasCsharp = " + hasCsharp);

        boolean hasJava = sentence.contains("Java"); // true
        System.out.println("hasJava = " + hasJava);

        boolean hasJava2 = sentence.contains("java"); // because it is lower case it returns me false
        // to ignore the case sensitivity here
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // equalsIgnoreCase can be used only for comparing (equals)
        // equalsIgnoreCase can not be used for contains
        // you need to convert them all lower case or all upper case
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("-----------------------");

        String input1 = "I love Java";
        String input2 = "java";

        System.out.println(input1.equals(input2));//false because they are not equals
        System.out.println(input1.equalsIgnoreCase(input2));//false because they are not equals
        System.out.println(input1.contains(input2));//false because of the case
        System.out.println(input1.toLowerCase().contains(input2));//true (make it ignores the case sensitivity9


        System.out.println("-----------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        System.out.println(x);// true because it starts with Woo
        boolean x1 = a.startsWith("oo"); // false because not starts with oo
        System.out.println(x1);

        String b = "Wooden Spoon";
        boolean y = b.endsWith("Spoon");
        System.out.println(y);// true because it ends with Spoon

        //in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase/uppercase
        boolean z = a.toLowerCase().startsWith("wooden");
        System.out.println(z);


    }
}
