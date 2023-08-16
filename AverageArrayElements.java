package level3_array_programs;

public class AverageArrayElements {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        double average = calculateAverage(array);

        System.out.println("Average of array elements: " + average);
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }
}

