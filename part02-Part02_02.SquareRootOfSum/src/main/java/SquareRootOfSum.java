
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.valueOf(scanner.nextLine());
        int s = Integer.valueOf(scanner.nextLine());
        int sqOfSum = (int) Math.sqrt(f + s);
        System.out.println(sqOfSum);
    }
}
