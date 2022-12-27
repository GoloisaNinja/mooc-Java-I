
public class MainProgram {

    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);
        Product computer = new Product("Computer", "electronics", 10);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
        System.out.println(computer);
    }
}
