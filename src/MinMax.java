public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 4};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.print("The minimum value or number is: " + min);
        System.out.print("The maximum value or number is: " + max);

    }
    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
