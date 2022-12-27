
import java.util.Scanner;

public class Factorial {

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        int f = factorial(input);
        System.out.println("Factorial: " + f);
    }
}
