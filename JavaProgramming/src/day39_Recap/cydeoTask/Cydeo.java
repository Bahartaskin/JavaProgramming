package day39_Recap.cydeoTask;

public class Cydeo { //has a relationship with other classes because cydeo Has developer,tester,teacher,student

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("---------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("---------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //student.work(); -> work does not inherited in student class

        System.out.println("---------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBug();

        System.out.println("---------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingBugs(); can not call it because fixingBugs is not an action of tester class
        tester.createTicket();

        System.out.println("---------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs();
        //  teacher.createTicket(); cannot call because teacher class does not have those properties

        System.out.println("---------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs(); can not call because these are never inherited to student class
        // student.createTicket();  students class does not have those properties
        student.study();

    }

}
