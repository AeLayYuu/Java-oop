package polymorphism;

public class CastSample {
    public static void main(String[] args) {
        Person person = new Employee();
        Employee.method(person);
    }
}
class Person {}

class Employee extends Person {
    static void method(Person person){
        if (person instanceof Employee){
            Employee employee = (Employee)person;  //downcasting
            System.out.println("DownCasting....");
        }
    }
}