package level3_array_programs;

import java.util.HashSet;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {4, 8, 12, 16, 20};

        int[] intersection = findIntersection(array1, array2);

        System.out.print("Intersection of the two arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] intersection = new int[set2.size()];
        int index = 0;

        for (int num : set2) {
            intersection[index++] = num;
        }

        return intersection;
    }
}

