package day31_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;

    //constructor is better version of setInfo method
    public Person(String name, char gender, int age){ // in order to use setInfo method we can use constructor
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
