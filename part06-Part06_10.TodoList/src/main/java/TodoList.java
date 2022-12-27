import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    // Constructor
    public TodoList() {
        this.list = new ArrayList<>();
    }
    public void add(String task) {
        this.list.add(task);
    }
    public void remove(int index) {
        index -= 1;
        this.list.remove(index);
    }
    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            int listNumber = i + 1;
            System.out.println(listNumber + ": " + this.list.get(i));
        }
    }
}
