import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] strArray = {"Xander", "Julie", "Tom", "Lou Lou", "Alex", "Sandy"};
        ArrayList<Integer> integers = new ArrayList<>(
                Arrays.asList(3, 44, 55, 678, 33, 10, 15, 2, 78)
        );
        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("Xander", "Philip", "Betty", "Alex", "Catherine", "Steve")
        );
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strArray));
        sort(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(integers);
        sortIntegers(integers);
        System.out.println(integers);

        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);
    }

}
