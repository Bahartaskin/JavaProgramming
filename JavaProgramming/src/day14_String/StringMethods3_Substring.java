package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring(beginningIndex , endingIndex): creates substring starting from the given beginning index till the given edning index (ending index is excluded)

        String word = "Cydeo School";
        String brand = word.substring(0, 4+1); // ending index always excluded thats why we add +1 to ending index
        System.out.println("brand = " + brand);

        String str1 = word.substring(6,11+1);
        //String str1 = word.substring(6); if u given till end of the string u dont need to write ending index
        //substring(beginningIndex): creates substring starting from the given beginning index till the end of the string
        System.out.println("str1 = " + str1);

        String word2 = "Python C# Ruby";
        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"
        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"
        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);





    }
}
