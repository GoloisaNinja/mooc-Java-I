
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = -1;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] personData = input.split(",");
            int age = Integer.valueOf(personData[1]);
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = personData[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
