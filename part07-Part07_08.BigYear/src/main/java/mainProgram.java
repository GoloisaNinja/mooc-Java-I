
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        //String initData = "Add\nHawk\nDorkus Dorkus\nAdd\nCrow\nCorvus " +
        //                  "Corvus\nObserve\nCrow\nObserve\nCrow\nAll\nOne\nHawk\nQuit";
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdList birds = new BirdList();
        UserInterface ui = new UserInterface(scan, birds);
        ui.start();
    }

}
