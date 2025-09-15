import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter five integers:");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();

            // Only add if not already in the list
            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }

        Collections.sort(integers);
        System.out.println("Sorted integers" + integers);
    }
}

