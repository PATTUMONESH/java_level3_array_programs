package level3_array_programs;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15, 30};

        int[] evenArray = separateEvenOdd(array);

        System.out.print("Even numbers: ");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int num : array) {
            if (!isEven(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] separateEvenOdd(int[] arr) {
        int[] evenArray = new int[arr.length];
        int evenIndex = 0;

        for (int num : arr) {
            if (isEven(num)) {
                evenArray[evenIndex] = num;
                evenIndex++;
            }
        }

        return evenArray;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

