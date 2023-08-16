package level3_array_programs;

public class InsertAtStart {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        int elementToInsert = 1;

        int[] newArray = insertAtStart(array, elementToInsert);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray after inserting at the start:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertAtStart(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        
        System.arraycopy(arr, 0, newArray, 1, arr.length);
        newArray[0] = element;
        
        return newArray;
    }
}
