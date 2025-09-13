
public class ArrayProb4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 5, 7};

        int sum = Sum(numbers);
        System.out.println("The sum of the elements in the array of numbers is " + sum);

        int product = Product(numbers);
        System.out.println("The product of the elements in the array of the numbers is " + product);

        int average = Average(numbers);
        System.out.println("The average of the above elements in the array is " + average);

    }
    private static int Sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    private static int Product(int[] numbers) {
        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }
    private static int Average(int[] numbers) {
        int average = 0;

        for (int i = 0; i < numbers.length; i++) {
            average =  Sum(numbers) / numbers.length;
        }
        return average;

    }
}
