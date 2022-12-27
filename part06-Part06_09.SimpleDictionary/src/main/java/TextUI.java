import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    // Constructor
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start() {
        boolean shouldContinue = true;
        while(shouldContinue) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            switch(command) {
                case "end":
                    shouldContinue = false;
                    break;
                case "add":
                    this.add();
                    break;
                case "search":
                    this.search();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
    public void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    public void search() {
        System.out.println("To be translated:");
        String word = this.scanner.nextLine();
        String translation = this.dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        System.out.println("Translation: " + translation);
    }
}
