import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        boolean entered = false;  // track if user entered any positive number

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int n = scanner.nextInt();

            if (n < 0) {  // stop when user enters negative
                break;
            }

            entered = true; // at least one valid number was entered

            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        if (!entered) {
            System.out.println("No positive number entered.");
        } else {
            System.out.println("Maximum number is " + max);
            System.out.println("Minimum number is " + min);
        }

        scanner.close();
    }
}

