
import java.util.ArrayList;

public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerRange, int upperRange) {
        for (int number : numbers) {
            if (number >= lowerRange && number <= upperRange) {
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        int lowerRange = 1;
        int upperRange = 4;
        System.out.println("The numbers in the range " + "[" + lowerRange + ", " + upperRange + "]");
        printNumbersInRange(numbers, lowerRange, upperRange);
    }
    
}
