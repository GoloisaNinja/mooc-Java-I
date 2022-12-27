public class Cube {
    private int edgeLength;
    // Constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    // Methods
    public int volume() {
        return (int) Math.pow(edgeLength, 3);
    }
    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
