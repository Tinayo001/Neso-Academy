import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = new Scanner(System.in).nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
