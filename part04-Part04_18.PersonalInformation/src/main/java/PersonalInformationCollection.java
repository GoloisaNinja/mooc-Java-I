
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("First name:");
            String fn = scanner.nextLine();
            if (fn.isEmpty()) {
                break;
            }
            System.out.println("Last name:");
            String ln = scanner.nextLine();
            System.out.println("Identification number:");
            String id = scanner.nextLine();
            PersonalInformation newPI = new PersonalInformation(fn, ln, id);
            infoCollection.add(newPI);
        }
        for (PersonalInformation pi : infoCollection) {
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
