package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "EU10";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {


        final double pi = 3.14;

       // pi = 4.14; -> final is unchangeable
       // pi = 5.4; -> final variables can not be reassigned

        final String name;

        name = "Java";

        //name = "Wooden Spoon"; -> final variables can not be reassigned

        System.out.println(name);

        System.out.println("---------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        //obj.birthDay = "June/01"; // final variables can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println("----------------------------------------");

        // FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);

    }

}
