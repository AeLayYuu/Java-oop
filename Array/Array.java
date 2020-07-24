package Array;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("Aung Ye Zaw", 25);
        Person person2 = new Person("Ei Ei",22);
        personArrayList.add(person1);
        personArrayList.add(person2);
        for (int i = 0; i < personArrayList.size();i++){
            System.out.println("Person Name:"+ personArrayList.get(i).name);
            System.out.println("Person Age:"+ personArrayList.get(i).age);
        }
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
