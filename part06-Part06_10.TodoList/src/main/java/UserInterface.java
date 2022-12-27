import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    // Constructor
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    public void start() {
        boolean shouldContinue = true;
        while(shouldContinue) {
            System.out.println("Command:");
            String command = this.scanner.nextLine().trim();
            switch(command) {
                case "stop":
                    shouldContinue = false;
                    break;
                case "add":
                    this.add();
                    break;
                case "remove":
                    this.remove();
                    break;
                case "list":
                    this.list.print();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    public void add() {
        System.out.println("To add:");
        String task = this.scanner.nextLine().trim();
        this.list.add(task);
    }
    public void remove() {
        System.out.println("Which one is removed?");
        int index = Integer.parseInt(this.scanner.nextLine());
        this.list.remove(index);
    }
}
