import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.println("Enter a number: ");
            sum += scanner.nextInt();

            if (sum > 100) {
                break;
            }
            System.out.println("Done" + sum);

        }
    }
}
