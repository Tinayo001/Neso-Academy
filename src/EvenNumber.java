public class EvenNumber {
    public static void main(String[] args) {

        int n;

        do {
            for (n = 100; n >= 1; n--) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }

            }
        } while (n <= 100 && n >= 1);
    }

}
