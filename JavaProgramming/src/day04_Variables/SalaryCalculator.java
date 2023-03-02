package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        //hourlyRate, weeklyHours
        //Names should be camel case

        int hourlyRate = 50;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52; // there are 52 week in a year


        // if u want to print variable u shoudn't use " " in the println
        // " " print it as a text
        //System.out.println(salary);
        //soutv is the short way to write variable
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("salary = " + salary);
        System.out.println("weeklyHours = " + weeklyHours);

        //to write $ u need to add in soutv
        //like: System.out.println("hourlyRate = $" + hourlyRate);

        System.out.println("salary = $" + salary);
    }
}
