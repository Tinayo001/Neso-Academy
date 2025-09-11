import java.util.Scanner;

public class Reverse{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        System.out.println("reversed " + reversed);
        scanner.close();
    }
}
