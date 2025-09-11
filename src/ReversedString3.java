public class ReversedString3 {
    public static void main(String[] args) {
        String originalString = "A legend like Cristiano Ronaldo";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        System.out.print("This is the reverse string of the string above " + reversedString);
    }
}
