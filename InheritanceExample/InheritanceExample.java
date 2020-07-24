package InheritanceExample;

public class InheritanceExample {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.work();
        developer.name="Aung Ye Zaw";
        developer.salary=999999;
        developer.info();
    }
}

class Employee {
    String name;
    float salary;
}
class Developer extends Employee {
    void work(){
        System.out.println("Devloper Status");
    }
    void info(){
        System.out.println("name"+"\t\t"+name+"\n"+"Salary"+"\t\t"+salary);
    }
}