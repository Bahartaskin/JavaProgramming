package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();// ı used this because I used nextLine after the next method

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();

        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        input.close();

    }

}
