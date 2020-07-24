import java.util.Arrays;
import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your mark ");
        int mark = scanner.nextInt();
        if (mark > 80 && mark < 100) {
            System.out.println("Grade A");
        } else if (mark > 60 && mark <= 80) {
            System.out.println("Grade B");
        } else if (mark > 40 && mark <= 60) {
            System.out.println("Grade C");
        } else if (mark > 20 && mark <= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

        System.out.println("Enter Your case");
        int x = scanner.nextInt();
        switch (x) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("None");
        }

        for (int a = 1; a < 9; a++) {
            System.out.println(a + "WTF");
        }
    }
}
