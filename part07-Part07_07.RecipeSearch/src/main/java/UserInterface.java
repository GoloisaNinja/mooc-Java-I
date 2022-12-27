import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeList recipes;
    // Constructor
    public UserInterface(Scanner scanner, RecipeList recipes) {
        this.scanner = scanner;
        this. recipes = recipes;
    }
    private void readFile() {
        System.out.println("File to read:");
        String fileName = this.scanner.nextLine();
        try {
            Scanner reader = new Scanner(new File(fileName));
            while(reader.hasNext()) {
                String name = "";
                int time = 0;
                ArrayList<String> ingredients = new ArrayList<>();
                int line = 0;
                while(reader.hasNext()) {
                    String lineData = reader.nextLine();
                    if (lineData.length() == 0) {
                        break;
                    }
                    if (line == 0) {
                        name = lineData;
                    } else if (line == 1) {
                        time = Integer.parseInt(lineData);
                    } else {
                        ingredients.add(lineData);
                    }
                    line++;
                }
                Recipe newRecipe = new Recipe(name, time, ingredients);
                this.recipes.addRecipe(newRecipe);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void start() {
        this.readFile();
        System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program");
        System.out.println("find name - searches recipes by name\nfind cooking time - searches recipes by cooking " +
                           "time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while(true) {
            System.out.println("Enter Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            switch(command) {
                case "list":
                    this.recipes.printList();
                    break;
                case "find name":
                    this.searchByName();
                    break;
                case "find cooking time":
                    this.searchByCookingTime();
                    break;
                case "find ingredient":
                    this.searchByIngredient();
                    break;
                default: break;
            }

        }
    }
    private void searchByName() {
        System.out.println("Searched word:");
        String search = this.scanner.nextLine();
        this.recipes.searchRecipeByName(search);
    }
    private void searchByCookingTime() {
        System.out.println("Max cooking time:");
        int maxTime = Integer.parseInt(this.scanner.nextLine());
        this.recipes.searchRecipeByCookingTime(maxTime);
    }
    private void searchByIngredient() {
        System.out.println("Ingredient:");
        String ingredient = this.scanner.nextLine();
        this.recipes.searchRecipeByIngredient(ingredient);
    }
}
