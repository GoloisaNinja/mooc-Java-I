public class Debt {
    private double balance;
    private double interestRate;
    // Constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    // Methods
    public void printBalance() {
        System.out.println(this.balance);
    }
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}
