
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() -1);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("I");
        strings.add("Am");
        strings.add("A");
        strings.add("Java");
        strings.add("Program");

        removeLast(strings);
        System.out.println(strings);
    }

}
