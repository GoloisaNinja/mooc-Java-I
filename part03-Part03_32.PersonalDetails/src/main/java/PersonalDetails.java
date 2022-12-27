
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameLength = 0;
        int yearCount = 0;
        int sumOfYears = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] personData = input.split(",");
            int birthYear = Integer.valueOf(personData[1]);
            int nameLength = personData[0].length();
            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = personData[0];
            }
            yearCount++;
            sumOfYears += birthYear;
        }
        System.out.println("Longest name: " + longestName);
        double avgYears = (double) sumOfYears / yearCount;
        System.out.println("Average of the birth years: " + avgYears);
    }
}
