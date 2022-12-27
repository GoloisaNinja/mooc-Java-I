
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        UserInterface ui = new UserInterface(scanner, recipes);
        ui.start();
    }

}
