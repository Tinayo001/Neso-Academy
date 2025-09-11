import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num; // declare outside so it's visible in while condition

        do {
            System.out.print("Enter a number between 1 and 10: ");
            num = scanner.nextInt();

            if (num >= 1 && num <= 10) {
                System.out.println(num + " is between 1 and 10. Thanks!");
            } else {
                System.out.println(num + " is not between 1 and 10! Try again.");
            }

        } while (num < 1 || num > 10); // keep looping while invalid

        scanner.close();
    }
}

