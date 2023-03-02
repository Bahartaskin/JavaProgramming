package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        //trim(): returns new String without the white spaces (unused spaces)
        String str1 ="  batch 25    ";// only the spaces that are not used between the characters are removed
        str1.trim(); //"batch 25"
        System.out.println(str1);

        //indexOf(str): returns the index number of first occurred character. returns int
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        //lastIndexOf(str): returns the index number of last occurred character. returns int
        int n2 = str2.lastIndexOf("o");
        int n3 = str2.lastIndexOf("ool");//make it unique
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming language";
        int n4 = str3.indexOf("a");// for the first a
        System.out.println("n4 = " + n4);
        int n5 = str3.indexOf("a "); //for second a make it unique with using the space next to second a
        System.out.println("n5 = " + n5);
        int n6 = str3.indexOf("an");//for the third a make it special with using n next to the third a

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a"); // indexOf method check from left to right and finds the first a
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");// lastİndexOf method checks from right to left and finds last a
        System.out.println("lastA = " + lastA);

        // for between character u need to make them unique
        int secondA = s.indexOf("a "); // unique: a with space
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");// unique: a with space and C
        System.out.println("thirdA = " + thirdA);

        //int fourthA = s.indexOf("ava W"); // you ca use it like this or
        //int fourthA = s.indexOf("Ca")+1; // or
        int fourthA = s.lastIndexOf("av"); // it will look from right to left
        System.out.println("fourthA = " + fourthA);

        int fifthA = s.lastIndexOf("a W"); //0r
        //int fifthA = s.indexOf("va")+1;
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);





    }
}
