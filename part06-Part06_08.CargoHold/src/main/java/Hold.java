import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    // Constructor
    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.suitcases.isEmpty() && suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        } else if (!this.suitcases.isEmpty()) {
            if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
                this.suitcases.add(suitcase);
            }
        }
    }
    public int totalWeight() {
        if (this.suitcases.isEmpty()) {
            return 0;
        }
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
    @Override
    public String toString() {
        String suitcaseString = "no suitcases (";
        if (!this.suitcases.isEmpty()) {
            suitcaseString = this.suitcases.size() > 1 ? this.suitcases.size() + " suitcases (" :
                    this.suitcases.size() + " suitcase (";
        }
        return suitcaseString + this.totalWeight() + " kg)";
    }
}
