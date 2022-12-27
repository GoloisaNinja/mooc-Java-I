public class Counter {
    private int value;
    // Default Constructor
    public Counter(int startValue) {
        this.value = startValue;
    }
    // Overloaded Constructors
    public Counter() {
        this(0);
    }
    // Getter
    public int value() {
        return this.value;
    }
    // Methods
    public void increase() {
        this.increase(1);
    }
    // Overloaded increase
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }
    public void decrease() {
        this.decrease(1);
    }
    // Overloaded decrease
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
    public String toString() {
        return "Counter: " + this.value;
    }
}
