import java.util.Scanner;

public class Favorite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter your favorite number: ");
        number = scanner.nextInt();

        System.out.println(number + " is also my favorite number");

        scanner.close();

    }
}
