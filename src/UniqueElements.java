import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers: ");
        int[] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(n);

        System.out.println("The array sorted is " + Arrays.toString(n));

        // Call the printArrays method
        printArrays(n);
        printUniqueElements(n);
    }

    public static void printArrays(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // new line after printing
    }
    public static void printUniqueElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.print(arr[i] + " ");

            }
        }

    }
}

