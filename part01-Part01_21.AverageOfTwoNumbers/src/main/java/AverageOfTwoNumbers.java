
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int f = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int s = Integer.valueOf(scanner.nextLine());
        double result = (double) (f + s) / 2;
        System.out.println("The average is " + result);

    }
}
