
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String f = scan.nextLine();
        System.out.println("Enter the second string:");
        String s = scan.nextLine();
        boolean same = f.equals(s);
        if (same) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
