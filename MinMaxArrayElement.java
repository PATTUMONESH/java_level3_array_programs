package level3_array_programs;

public class MinMaxArrayElement {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15, 30};

        int minimum = findMinimum(array);
        int maximum = findMaximum(array);

        System.out.println("Minimum element: " + minimum);
        System.out.println("Maximum element: " + maximum);
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        
        return min;
    }
    
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
}
