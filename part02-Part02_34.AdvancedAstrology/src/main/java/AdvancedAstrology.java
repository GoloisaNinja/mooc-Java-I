
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        if (number == 0) {
            return;
        }
        String spaces = "";
        for (int i = 1; i <= number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // make the tree - only tree not base
        for (int i = 1; i <= height; i++) {
            int starWidth = i;
            if (i != 1) {
                starWidth = (i * 2) - 1;
            }
            int centeredSpaces = height - i;
            printSpaces(centeredSpaces);
            printStars(starWidth);
        }
        // make the base
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
