import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter you name and age: ");
        name = scanner.nextLine();
        age = scanner.nextInt();

        System.out.println(name + "!" + "You are " + age + " years old.");
    }
}
