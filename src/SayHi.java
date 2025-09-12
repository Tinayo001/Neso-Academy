import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        sayHi();
        sayHi("NesoAcademy");
    }
    public static void sayHi() {
        System.out.print("Hi");
    }
    public static void sayHi(String name) {
        System.out.println("Hi " + name);
    }
}
