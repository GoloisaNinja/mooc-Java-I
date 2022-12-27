import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i + 1);
            if (array[i] > array[smallestIndex]) {
                swap(array, i, smallestIndex);
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers2);
    }

}
