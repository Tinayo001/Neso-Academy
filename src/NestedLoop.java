import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number n: ");
        int n = scanner.nextInt();

        if (n > 10) {
            System.out.println(">10");
        } else if (n == 10) {
            System.out.println("=10");
        } else {
            System.out.println("<10");
        }
    }
}
