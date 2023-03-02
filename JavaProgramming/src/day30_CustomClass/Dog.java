package day30_CustomClass;

public class Dog {

    // you don't need main class in the custom classes

    public String name; //Attributes
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat() { // Actions
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    // shortcut for creating toString
    // right click --> choose --> generate --> choose toString
    // --> choose what Attributes you want to add
    // --> uncheck the "Insert overRide" at left bottom --> click OK


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */