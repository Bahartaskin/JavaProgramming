package day34_GarbageCollection_AccessModifier;

public class StaticBlock {

    public static void main(String[] args) {//main method executed after static method
        System.out.println("I am the java master");
    }

    //static block --> runs first before anything, and only runs one time
    static{// first thing that executed is static block
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }

}
