
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name?");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item newItem = new Item(identifier, name);
            if (!archive.contains(newItem)) {
                archive.add(newItem);
            }
        }
        if (archive.size() > 0) {
            System.out.println("==ITEMS==");
            for (Item item : archive) {
                System.out.println(item);
            }
        }
    }
}
