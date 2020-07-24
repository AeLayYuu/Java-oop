package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Student student = new FirstYear();
        student.study();
        student.getAdmissionNo();
        System.out.println(student.getAdmissionNo());
        student.exam();

    }
}
abstract class Student {
    String name;
    String admissionNo;
    abstract String getAdmissionNo();
    abstract void study();
    abstract void exam();
}
class FirstYear extends Student{

    @Override
    String getAdmissionNo() {
        return "AdmissionNo 11012";
    }

    @Override
    void study() {
        System.out.println("Study");

    }

    @Override
    void exam() {
        System.out.println("Pass");

    }
}
