package Abstraction;

public class InterfaceSample {
    public static void main(String[] args) {
        Student1 student = new SecondYear();
        student.exam();
        student.study();
    }

}
interface Student1 {
    void study();
    void exam();
}

class SecondYear implements Student1{

    @Override
    public void study() {
        System.out.println("Study");
    }

    @Override
    public void exam() {
        System.out.println("Exam");

    }
}