package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person();
        //p1.name = "Daniel"; I cannot call it directly
        p1.setName("Daniel");
        p1.setAge(31);

        //I don't have direct access
        //System.out.println(p1.name+" : "+p1.age);
        System.out.println(p1.getName()+" : "+p1.getAge());

    }

}
