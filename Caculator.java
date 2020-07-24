import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 =scanner.nextInt();
        System.out.println("Enter Number 2");
        int num2 = scanner.nextInt();
        Calculation calculation= new Calculation(num1,num2);
        calculation.add();
        calculation.sub();
        calculation.mult();
        calculation.div();
        calculation.remain();

    }
}
class Calculation {
   int number1,number2;
    Calculation (int a,int b){
        this.number1=a;
        this.number2=b;

    }
    void add(){
        System.out.println(number1+number2);
    }
    void sub(){
        System.out.println(number1-number2);
    }
    void mult(){
        System.out.println(number1*number2);
    }
    void div(){
        System.out.println(number1/number2);
    }
    void remain() {
        System.out.println(number1 % number2);
    }
}
