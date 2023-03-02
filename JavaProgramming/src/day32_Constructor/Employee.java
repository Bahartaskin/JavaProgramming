package day32_Constructor;

public class Employee {

    public String name, jobTitle;
    public  char gender;
    public double salary;

    public  Employee(String name){
        this.name = name;
    }
// benefit of overloading constructor is you will have more options when you're creating objects
    public Employee(String name, char gender){ //overloading constructor
        //to call one constructor to another constructor
        this(name); //this.name = name;
        // you can call constructor with this key word and giving constructor name
        //Employee(name); // it doesn't work if u try to just with its name.
        this.name = name;
        this.gender =gender;
    }

    public Employee(String name, char gender, String jobTitle){ //overloading constructor
        //this.name = name;
        //this.gender = gender;
        //instead of these
        this(name, gender); // reuse the function by calling overloading constructor
        this.jobTitle = jobTitle;
    }

    public Employee (String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle); // reuse the function by calling overloading constructor
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
        //this. : to call instance variables & instance methods
        //this() : used for calling the constructors

        // when you're calling the constructor

/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself
 */