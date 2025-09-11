import java.util.Scanner;

public class isEven {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }

        scanner.close();

    }
}
