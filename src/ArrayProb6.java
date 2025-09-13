import java.util.Arrays;
import java.util.Scanner;

public class ArrayProb6 {
    public static void main(String[] args) {
        int[] originalNumbers = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] newNumbers = new int[originalNumbers.length];

        int index = 0;

        for (int i = 0; i < originalNumbers.length; i++) {
            if (originalNumbers[i] % 2 != 0) {
                newNumbers[index] = originalNumbers[i];
                index++;
            }

        }

        for (int i = 0; i < originalNumbers.length; i++) {
            if (originalNumbers[i] % 2 == 0) {
                newNumbers[index] = originalNumbers[i];
                index++;
            }
        }

        System.out.println("orginalNumbers" + Arrays.toString(originalNumbers));
        System.out.println("NewNumbers" + Arrays.toString(newNumbers));
    }
}

