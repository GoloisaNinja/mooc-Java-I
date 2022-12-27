import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private Grades grades;
    // Constructor
    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int input = Integer.parseInt(this.scanner.nextLine());
            if (input == -1) {
                break;
            }
            grades.addGrade(input);
        }
        System.out.println("Point average (all): " + grades.pointAverageAll());
        System.out.println("Point average (passing): " + grades.pointAveragePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.displayGradeDistribution();
    }
}
