import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;
    // Constructor
    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    public void searchRecipeByName(String search) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
    }
    public void searchRecipeByCookingTime(int maxTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    public void searchRecipeByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    public void printList() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }
}
