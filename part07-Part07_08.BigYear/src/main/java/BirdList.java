import java.util.ArrayList;
import java.util.Arrays;

public class BirdList {
    private ArrayList<Bird> birds;
    // Constructor
    public BirdList() {
        this.birds = new ArrayList<>();
    }
    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        this.birds.add(newBird);
    }
    public boolean observe(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
                return true;
            }
        }
        return false;
    }
    public void printAllBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    public void printOneBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
