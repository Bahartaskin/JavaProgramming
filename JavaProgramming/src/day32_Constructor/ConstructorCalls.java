package day32_Constructor;

public class ConstructorCalls {

    public  ConstructorCalls(){
        System.out.println("Default Constructor");
        //this(); cannot used --> 5. Constructor can not call or contain itself
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //this(); cannot used here --> 3. Constructor call MUST be at the first step
    }

    public ConstructorCalls(String str){
        this(10);
        //this(); cannot used --> 4. One constructor can not call more than one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(); //Default Constructor

        System.out.println("------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10); //Default Constructor
                                                            // Constructor with int argument

        System.out.println("------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java"); /* Default Constructor
                                                                 Constructor with int argument
                                                                 Constructor with String argument */



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