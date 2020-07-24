public class ModifierClass {
    public static void main(String[] args) {
        System.out.println(Counter.count);
        System.out.println(Counter.count);
        System.out.println(Counter.count);
        University university = new University();
        university.change();
        university.display();
    }
}
    class Counter {
        static int count = 1;
        Counter(){
            count ++;
            System.out.println(count);
        }
    }

    class University {
    static String name = "yu";
    static void change(){
        name = "Yangon Universiy";
    }
    void display(){
        System.out.println(name);
    }
    }

