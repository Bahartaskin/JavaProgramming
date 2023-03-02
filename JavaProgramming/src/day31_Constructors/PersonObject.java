package day31_Constructors;

public class PersonObject {


    public static void main(String[] args) {

        // when u create object via constructor
        Person person1 = new Person("Daniel", 'M', 32);
        //we dont need to call setInfo method to give info for objects
        System.out.println(person1);

        Person person2 = new Person("Kseniia", 'F', 28);

        person2.age=30;

        System.out.println(person2);

    }
}
