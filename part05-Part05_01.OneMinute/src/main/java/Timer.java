public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;
    // Constructor
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    // Methods
    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
    public String toString() {
        return this.seconds.toString() + ":" + this.hundredths.toString();
    }
}
