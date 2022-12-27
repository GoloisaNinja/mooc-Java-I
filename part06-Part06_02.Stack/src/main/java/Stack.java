import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    // Constructor
    public Stack() {
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void add(String value) {
        stack.add(value);
    }
    public ArrayList<String> values() {
        return this.stack;
    }
    public String take() {
        if (stack.isEmpty()) {
            return "";
        }
        int indexToRemove = this.stack.size() - 1;
        String stackItem = this.stack.get(indexToRemove);
        this.stack.remove(indexToRemove);
        return stackItem;
    }
}
