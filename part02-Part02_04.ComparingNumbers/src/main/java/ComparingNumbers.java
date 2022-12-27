
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.valueOf(scanner.nextLine());
        int s = Integer.valueOf(scanner.nextLine());
        boolean fGtS = f > s;
        boolean sGtF = f < s;
        if (fGtS) {
            System.out.println(f + " is greater than " + s + ".");
        } else if (sGtF) {
            System.out.println(f + " is smaller than " + s + ".");
        } else {
            System.out.println(f + " is equal to " + s + ".");
        }
    }
}
