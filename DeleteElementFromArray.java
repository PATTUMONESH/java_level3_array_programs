package level3_array_programs;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15, 30};

        int deleteValue = 8;

        int[] newArray = deleteElement(array, deleteValue);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray after deleting " + deleteValue + ":");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] deleteElement(int[] arr, int value) {
        int[] newArray = new int[arr.length - 1];
        int index = 0;

        for (int num : arr) {
            if (num != value) {
                newArray[index] = num;
                index++;
            }
        }

        return newArray;
    }
}

