import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = scanner.nextLine();

        System.out.print("Enter your age");
        int age = scanner.nextInt();

        System.out.print("Your name is " + name + " and your age is " + age);
    }
}
