import java.util.Scanner;

public class SumOfStrictDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of the divisors of this number " + n + " = " + sum);
        scanner.close();
    }
}
