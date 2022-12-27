import java.util.Scanner;
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    // Constructor
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    public void start() {
        boolean shouldContinue = true;
        while(shouldContinue) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();
            switch(command) {
                case "X":
                    shouldContinue = false;
                    break;
                case "1":
                    this.addJoke();
                    break;
                case "2":
                    this.drawJoke();
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    this.jokes.printJokes();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.jokes.addJoke(joke);
    }
    public void drawJoke() {
        System.out.println("Drawing joke:");
        System.out.println(this.jokes.drawJoke());
    }
}
