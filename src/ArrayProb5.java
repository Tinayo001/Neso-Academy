import java.util.Scanner;

public class ArrayProb5 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 3, 4};

        System.out.print("Enter a number to search");

        int searchElement = new Scanner(System.in).nextInt();

        System.out.println(getNumberOcc(numbers, searchElement));

    }

    public static int getNumberOcc(int[] numbers, int searchElement) {
        int occ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                occ++;
            }
        }
        return occ;
    }
}
