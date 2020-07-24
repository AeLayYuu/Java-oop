public class hello_world {

    public static void main(String[] args) {

        int a = 0;
        
        a++;

        System.out.println(a);

        int b = 0;
        System.out.println("B is "+ b++);
        System.out.println(" B is "+ ++b);
    }


}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}