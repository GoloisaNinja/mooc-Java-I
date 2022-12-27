
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        String l = "This is a leap year.";
        String n = "This is not a leap year.";
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(l);
            } else {
                System.out.println(n);
            }
        } else if (year % 4 == 0) {
            System.out.println(l);
        } else {
            System.out.println(n);
        }
    }
}
