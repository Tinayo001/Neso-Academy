public class MaxInCol {
    public static void main(String[] args) {
        int [] [] integers = {
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 11, 4}
        };

        for (int i = 0; i < 4; i++){
            int max = 0;
            for (int j = 0; j < 3; j++) {
                if (integers[j][i] > max) {
                    max = integers[j][i];
                }
            }
            System.out.println("The maximum number in Column " + (i + 1) + ": " + max);
        }
    }
}
