import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number n: ");
        double n = scanner.nextDouble();

        System.out.println("Enter another number: ");
        double n2 = scanner.nextDouble();

        System.out.println("Enter one operator: ('*, +, -, /')");
        char op = scanner.next().charAt(0);

        Double result = null; // use wrapper to allow "null" as default

        switch (op) {
            case '*':
                result = n * n2;
                break;
            case '+':
                result = n + n2;
                break;
            case '-':
                result = n - n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n / n2;
                } else {
                    System.out.println("Error! Can't divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        // Only print result if it was actually computed
        if (result != null) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

