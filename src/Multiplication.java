import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        multiply(number);

        scanner.close();
    }
    public static void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + (n * i));
        }
    }
}

