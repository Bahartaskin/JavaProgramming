package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        //replace(oldValue, newValue): returns new string by repalcing All the old values with the given new value.
        String str = "Java is fun, I love learning Java";
        String str2 =  str.replace("Java" ,  "Python"); // "Python is fun, I love learning Python"
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);//JohnSmith@gmail.com

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "");// if u take out a word u can use blank "" string
        sentence = sentence.replace("   ", "");// to replace 3 spaces with 1 space
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";// to replace just one of them make it unique and add the spaces to second value if u want spaces
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";// you can only change the letters
        s3 = s3.replace("a", "e"); //"Jeve"
        System.out.println(s3);

        System.out.println("------------------------------------");

        //replaceFirst(oldValue, newValue): returns new string by repalcing  the FIRST matchingold values with the given new value.
        String result = "Java Java Java";

        //result = result.replace("Java", "Python"); this will change all the Javas
        result = result.replaceFirst("Java", "Python"); // this will change only the first Java
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2= result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o"); //"Jova"
        System.out.println(result3);
       // result3 = result3.replaceFirst("va", "vo"); //"Javo"








    }
}
