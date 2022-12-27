public class Exercise {
    private String name;
    private boolean completed;
    // Constructor
    public Exercise(String name) {
        this.name = name;
        this.completed = false;
    }
    // Getter
    public String getName() {
        return this.name;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public boolean isCompleted() {
        return this.completed;
    }
}
