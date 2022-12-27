
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int f = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int s = Integer.valueOf(scan.nextLine());
        String gm = "Greater number is: ";
        String eq = "The numbers are equal!";
        if (f > s) {
            System.out.println(gm + f);
        } else if (s > f) {
            System.out.println(gm + s);
        } else {
            System.out.println(eq);
        }
    }
}
