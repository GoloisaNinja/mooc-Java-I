import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    // Constructor
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    public void addItem(Item item) {
        if (items.isEmpty() && item.getWeight() <= this.maximumWeight) {
            items.add(item);
        } else if (!items.isEmpty()) {
            if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
                items.add(item);
            }
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        if (this.items.isEmpty()) {
            return totalWeight;
        }
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        if (this.items.size() == 1) {
            return this.items.get(0);
        }
        Item heaviestItem = items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    @Override
    public String toString() {
        String itemString = "no items (";
        if (!this.items.isEmpty()) {
            itemString = this.items.size() > 1 ? this.items.size() + " items (" : this.items.size() + " item (";
        }
        return itemString + this.totalWeight() + " kg)";
    }
}
