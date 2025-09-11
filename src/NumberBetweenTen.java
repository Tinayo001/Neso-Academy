import java.util.Scanner;

public class NumberBetweenTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between one and ten");

            int num = scanner.nextInt();

            if (num >= 1 && num <= 10) {
                System.out.println(num + " is between 1 and ten. Thanks!");
                break;
            } else {
                System.out.println(num + " is not between 1 and ten!Try again");
            }

        }

    }
}
