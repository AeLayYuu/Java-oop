import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number 2");
        int num2 = scanner.nextInt();
        System.out.println("Enter Operator");
        int operator = scanner.next().charAt(0);
        Cal cal = new Cal(num1,num2);
        if (operator == '+') {
            cal.add();
        } else if (operator == '-') {
            cal.sub();
        } else if (operator == '*') {
            cal.mult();
        } else if (operator == '/') {
            cal.sub();
        } else if (operator == '%') {
            cal.remain();
        } else {
            System.out.println("Can't Calculate");
        }

    }

    static class Cal {
        int number1, number2;

        Cal(int a, int b) {
            this.number1 = a;
            this.number2 = b;

        }

        void add() {
            System.out.println(number1 + number2);
        }

        void sub() {
            System.out.println(number1 - number2);
        }

        void mult() {
            System.out.println(number1 * number2);
        }

        void div() {
            System.out.println(number1 / number2);
        }

        void remain() {
            System.out.println(number1 % number2);
        }
    }
}
