
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {

        return Math.abs(this.getTotalPricePerSquare() - compared.getTotalPricePerSquare());
    }

    public int getTotalPricePerSquare() {
        return this.princePerSquare * this.squares;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.getTotalPricePerSquare() > compared.getTotalPricePerSquare();
    }

}
