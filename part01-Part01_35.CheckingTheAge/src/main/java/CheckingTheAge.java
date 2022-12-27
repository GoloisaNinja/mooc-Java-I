
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        boolean possible = age >= 0 && age <= 120;
        if (possible) {
            System.out.printf("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
