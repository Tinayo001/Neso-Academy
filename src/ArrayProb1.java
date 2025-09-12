import java.util.Arrays;
import java.util.Scanner;

public class ArrayProb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number");
        int n = scanner.nextInt();

        int [] numbers = new int[6];

        Arrays.fill(numbers, n);
        System.out.print(Arrays.toString(numbers));
    }
}
