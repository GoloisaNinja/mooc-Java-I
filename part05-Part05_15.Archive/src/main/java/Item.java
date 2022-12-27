public class Item {
    private String identifier;
    private String name;
    // Constructor
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    // Methods
    @Override
    public String toString() {
        return this.identifier + ":" + " " + this.name;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item itemToCompare = (Item) compared;
        if (this.identifier.equals(itemToCompare.identifier)) {
            return true;
        }
        return false;
    }
}
