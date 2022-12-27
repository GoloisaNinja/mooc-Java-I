import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private BirdList birds;
    // Constructor
    public UserInterface(Scanner scanner, BirdList birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    public void start() {
        while(true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            switch(command) {
                case "Add":
                    this.addBird();
                    break;
                case "Observation":
                    this.observe();
                    break;
                case "All":
                    this.birds.printAllBirds();
                    break;
                case "One":
                    this.printOne();
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
    public void addBird() {
        System.out.println("Name:");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = this.scanner.nextLine();
        this.birds.addBird(name, latinName);
    }
    public void observe() {
        System.out.println("Bird?");
        String birdName = this.scanner.nextLine();
        if (!this.birds.observe(birdName)) {
            System.out.println("Not a bird!");
        }
    }
    public void printOne() {
        System.out.println("Bird?");
        String birdName = this.scanner.nextLine();
        this.birds.printOneBird(birdName);
    }
}
