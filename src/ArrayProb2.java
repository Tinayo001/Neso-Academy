import java.awt.Point;
import java.util.Scanner;

public class ArrayProb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: (max is 20) ");
        int n = scanner.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, try again: ");
            n = scanner.nextInt();
        }

        Point[] points = new Point[n];
        fillArrayOfPoints(points, scanner);
        printArrayOfPoints(points);

        scanner.close();
    }

    private static void fillArrayOfPoints(Point[] points, Scanner input) {
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            int x = input.nextInt();
            int y = input.nextInt();
            points[i] = new Point(x, y);
        }
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.print("You entered: ");
        for (int i = 0; i < points.length; i++) {
            System.out.print("(" + points[i].x + ", " + points[i].y + ") ");
        }
    }
}


