
import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("alex", "sunshine");
        users.put("emma", "haskell");
        System.out.println("Enter username:");
        String userNameInput = scanner.nextLine();
        System.out.println("Enter password:");
        String userPassInput = scanner.nextLine();
        if (users.containsKey(userNameInput)) {
            if (users.get(userNameInput).equals(userPassInput)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
