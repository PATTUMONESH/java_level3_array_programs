package level3_array_programs;

public class InsertAtMiddle {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int elementToInsert = 3;
        int position = 2;

        int[] newArray = insertAtMiddle(array, elementToInsert, position);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray after inserting at the middle:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertAtMiddle(int[] arr, int element, int position) {
        int[] newArray = new int[arr.length + 1];
        
        System.arraycopy(arr, 0, newArray, 0, position);
        newArray[position] = element;
        System.arraycopy(arr, position, newArray, position + 1, arr.length - position);
        
        return newArray;
    }
}

