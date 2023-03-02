package day10_NestedIfAndTernaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {
// nested if statements can be done by using ternaries
//but it is not readable that is why it is better use nested if without ternaries
        int s= 85 ;
      //passed or failed
        if(s>=0&&s<=100){

            if(s>=60){
                System.out.println("Pass"); //string
            }else{
                System.out.println("Fail"); // string
            }


        }else{
            System.out.println("Invalid"); // string
        }
        //with ternaries

       String result = (s>=0&&s<=100)? (s>=60)? "Pass" : "Fail" : "Invalid";
        System.out.println(result);
    }

}
