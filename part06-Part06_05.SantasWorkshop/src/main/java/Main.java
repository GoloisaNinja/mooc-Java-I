
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift gameConsole = new Gift("PS5", 4);
        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(gameConsole);
        System.out.println(gifts.totalWeight());

    }
}
