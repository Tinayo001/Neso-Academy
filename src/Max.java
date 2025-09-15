public class Max {
    public static void main(String[] args) {
        int [] [] integers = {
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 11, 4}
        };


        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j < 4; j++) {
                if (integers[i][j] > max) {
                    max = integers[i][j];
                }

            }
            System.out.println("The maximum number in Row " + (i + 1) + ":" + max);
        }
    }
}
