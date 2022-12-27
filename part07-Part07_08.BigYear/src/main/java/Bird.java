public class Bird {
    private String name;
    private String latinName;
    private int observations;
    // Constructor
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getLatinName() {
        return latinName;
    }
    public int getObservations() {
        return observations;
    }
    public void observe() {
        this.observations++;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
