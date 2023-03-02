package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int year = 2000;
        int number = 6;
        String day = "";

        if(number >= 1 && number <= 12) { // number: 1~12

            switch (number) {

                case 2:
                    day = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = "30 days";
                    break;
                default: //1, 3, 5,7,8, 10, 12
                    day = "31 days";

            }

        }else{
            day = "Invalid Number";
        }
        System.out.println(day);
    }
}
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */