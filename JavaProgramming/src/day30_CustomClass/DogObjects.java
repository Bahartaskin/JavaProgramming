package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog(); // data type (what we assign) is Dog because we need String, int data type id Dog data type
        // to access to the data of the object use .(dot)
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        Dog dog2 = new Dog();
        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        // to give info easier we create a setInfo method in Dog class and use it
        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 2,'M',"Large","Black");



        // to print your object you need to create to string method in your custom class
        // if you don't have toString method it will give you hashcode
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat(); // actions in the Dog Class
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();
    }

}
