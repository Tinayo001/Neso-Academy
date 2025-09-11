import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The number is odd");

        }
    }
}
