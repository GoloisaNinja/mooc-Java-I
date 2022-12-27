
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int f = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int s = Integer.valueOf(scanner.nextLine());
        int ar = f + s;
        int sr = f - s;
        int mr = f * s;
        double dr = (double) f / s;
        System.out.println(f + " + " + s + " = " + ar);
        System.out.println(f + " - " + s + " = " + sr);
        System.out.println(f + " * " + s + " = " + mr);
        System.out.println(f + " / " + s + " = " + dr);
    }
}
