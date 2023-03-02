package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

 // with , (comma) I don't need to write String again and again
// for multiple variable in same data type

         String name = " James King",
                buildingNumber = " 11821B",
                streetName = " Jones Branch Dr",
                city = " McLean",
                state = " VA",
                zipCode = " 22031A";

        System.out.println(name + "\n" + buildingNumber + streetName + "\n" + city + state + zipCode);

// or we can write it like;

       /* String name = " James King";
        String buildingNumber = " 11821B";
        String streetName = " Jones Branch Dr";
        String city = " McLean";
        String state = " VA";
        String zipCode = " 22031A"; */
// any concatenation that you did you can always assign it back to a variable of string to make it reusable
        String address = name + "\n" + buildingNumber + streetName + "\n" + city + state + zipCode;

        System.out.println(address);
    }
}
