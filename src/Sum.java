import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n  = scanner.nextInt();

        int result = sum(n);

        System.out.println("The sum = " + result);

        scanner.close();

    }
    public static int sum(int n) {
        int total = 0;
        int i;

        for (i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
