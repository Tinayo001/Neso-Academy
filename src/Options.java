import java.util.ArrayList;
import java.util.Scanner;

public class Options {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            DisplayMenu();
            int option = input.nextInt();

            switch (option) {
                case 1:
                    // ADD
                    System.out.print("Enter the integer you want to add: ");
                    int toAdd = input.nextInt();
                    integers.add(toAdd);
                    System.out.println(toAdd + " added.");
                    break;

                case 2:
                    // REMOVE
                    System.out.print("Enter the integer you want to remove: ");
                    int toRemove = input.nextInt();
                    if (integers.remove(Integer.valueOf(toRemove))) {
                        System.out.println(toRemove + " removed.");
                    } else {
                        System.out.println(toRemove + " not found in the list.");
                    }
                    break;

                case 3:
                    // DISPLAY
                    System.out.println("Current list: " + integers);
                    break;

                case 4:
                    // EXIT
                    System.out.println("Exiting program. Goodbye!");
                    input.close();
                    return; // break out of while loop and end program

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private static void DisplayMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }
}

