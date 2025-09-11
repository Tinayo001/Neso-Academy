import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        if (num >= 1000 && num <= 9999) {
            System.out.println("You have entered this number: " + num);

            String numStr = String.valueOf(num);

            // Convert chars to digits
            int d1 = numStr.charAt(0) - '0';
            int d2 = numStr.charAt(1) - '0';
            int d3 = numStr.charAt(2) - '0';
            int d4 = numStr.charAt(3) - '0';

            if (d1 + d2 == d3 + d4) {
                System.out.println("That's a lucky number! 🎉");
            } else {
                System.out.println("Not a lucky number.");
            }

        } else {
            System.out.println("Invalid input! Please enter a four-digit number.");
        }

        scanner.close();
    }
}

