package level3_array_programs;

public class SumPositiveNegative {

    public static void main(String[] args) {
        int[] array = {10, -5, 8, -20, 15, -30};

        int positiveSum = 0;
        int negativeSum = 0;

        for (int num : array) {
            if (num > 0) {
                positiveSum += num;
            } else if (num < 0) {
                negativeSum += num;
            }
        }

        System.out.println("Sum of positive elements: " + positiveSum);
        System.out.println("Sum of negative elements: " + negativeSum);
    }
}

