package level3_array_programs;

public class SumArrayElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = calculateSum(array);

        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}

