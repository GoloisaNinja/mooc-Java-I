
import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList<Integer> numbers) {
        int result = 0;
        if (numbers.size() == 0) {
            return result;
        }
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
    public static void main(String[] args) {
        // Try your method here
    }

}
