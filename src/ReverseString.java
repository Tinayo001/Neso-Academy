public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello World";

        StringBuilder stringBuilder = new StringBuilder(originalString);

        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();

        System.out.println("Reversed String: " + reversedString);
        System.out.println("Original String: " + originalString);
    }
}
