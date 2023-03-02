package day30_CustomClass;

public class Student {

    public String name;
    public  char gender;
    public int age;
    public int ID;
    public char grade;

   /* public  void setInfo(String name, char gender, int age, int ID, char grade){
        // to compilers to know we assign it to instance variable, we use "this" kew word
        // we do this to use same name in setInfo method name --> name
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
    */

    //shortcut of creating set info method with "this" keyword
    //right click --> choose generate --> click enter (constructor)
    // --> select all (attributes you want to use) --> click OK
    // -->  delete class name (after public) and write void setInfo
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
