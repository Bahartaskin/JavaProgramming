package day39_Recap.cydeoTask;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudent;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudent) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudent(fieldOfStudent);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudent() {
        return fieldOfStudent;
    }

    public void setFieldOfStudent(String fieldOfStudent) {
        this.fieldOfStudent = fieldOfStudent;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }


    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudent='" + fieldOfStudent + '\'' +
                '}';
    }
}
/*
6. Create a subclass of Person named Student
            Extra variables:
                studentId, fieldOfStudy
            Encapsulate all the fields
            Add a constructor to set all the fields
            Encapsulate all the fields
            Methods:
                study()
 */