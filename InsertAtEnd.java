package level3_array_programs;

public class InsertAtEnd {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 6;

        int[] newArray = insertAtEnd(array, elementToInsert);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray after inserting at the end:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertAtEnd(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = element;
        
        return newArray;
    }
}

