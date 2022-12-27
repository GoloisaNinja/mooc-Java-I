import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsAsGrades;
    // Constructors
    public Grades() {
        this.grades = new ArrayList<>();
        this.pointsAsGrades = new ArrayList<>();
    }
    private int convertPointToGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        }
        return 5;
    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
            this.pointsAsGrades.add(convertPointToGrade(grade));
        }
    }
    public int getPassingGradeCount() {
        int passingGradeCount = 0;
        for (int grade : this.grades) {
            if (grade >= 50) {
                passingGradeCount++;
            }
        }
        return passingGradeCount;
    }
    public double pointAverageAll() {
        int count = this.grades.size();
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return 1.0 * sum / count;
    }
    public double pointAveragePassing() {
        int count = 0;
        int sum = 0;
        for (int grade : this.grades) {
            if (grade >= 50) {
                count++;
                sum += grade;
            }
        }
        return 1.0 * sum / count;
    }
    public double passPercentage() {
        return (double) 100.00 * getPassingGradeCount() / this.grades.size();
    }
    public void displayGradeDistribution() {
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";
        for (int grade : this.pointsAsGrades) {
            switch(grade) {
                case 0:
                    zero += "*";
                    break;
                case 1:
                    one += "*";
                    break;
                case 2:
                    two += "*";
                    break;
                case 3:
                    three += "*";
                    break;
                case 4:
                    four += "*";
                    break;
                default: {
                    five += "*";
                    break;
                }
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
    }
}
