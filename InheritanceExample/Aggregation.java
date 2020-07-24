package InheritanceExample;

public class Aggregation {
    public static void main(String[] args) {
        Address address=new Address("Than Lan St", "Hlaing", "Yangon");
        Student student=new Student("Aung Ye Zaw", address);
        System.out.println(student.name);
        System.out.println(student.address.street);
        System.out.println(student.address.township);
        System.out.println(student.address.city);
        Employer employer = new Employer("Aung Ye Zaw",address );
        System.out.println(employer.name);
        System.out.println(employer.address);

    }
}
class Address {
    String street;
    String township;
    String city;

    public Address(String street, String township, String city) {
        this.street = street;
        this.township = township;
        this.city = city;
    }
}
class Student {
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
class Employer {
    String name;
    Address address;

    public Employer(String name,Address address) {
        this.name = name;
        this.address = address;
    }
}