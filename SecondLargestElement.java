package level3_array_programs;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15, 30};

        int secondLargest = findSecondLargest(array);
        
        System.out.println("Second largest element: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
