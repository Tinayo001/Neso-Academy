import java.util.Arrays;
import java.util.Scanner;

public class ArrayProb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: (max is 20) ");
        int n = scanner.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, try again: ");
            n = scanner.nextInt();
        }

        int[] numbers = new int[n];
        fillArrayOfIntegers(numbers, scanner);
        printArrayOfIntegers(numbers);

        scanner.close();
    }

    private static void fillArrayOfIntegers(int[] numbers, Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.print("You entered: " + Arrays.toString(numbers));
    }
}

