
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        Counter counter1 = new Counter(25);
        counter.increase(); // counter = 1
        counter.increase(15); // counter = 16
        System.out.println(counter);
        counter.decrease(); // counter = 15
        System.out.println(counter);
        counter.decrease(5); // counter = 10
        System.out.println(counter);

        counter1.increase(); // counter = 26
        counter1.decrease(27); // this wont work - counter still at 26
        System.out.println(counter1);
        counter1.decrease(26); // counter = 0
        System.out.println(counter1);
    }
}
