import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "nackos";

        boolean isPalindrome = true;

        int i, j;
        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

