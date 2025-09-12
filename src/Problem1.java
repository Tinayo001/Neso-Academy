import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {   // <= instead of < so last row prints
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars + inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n) {
                    // last row should be completely filled with stars
                    System.out.print("*");
                } else {
                    // print star at the borders, space inside
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

