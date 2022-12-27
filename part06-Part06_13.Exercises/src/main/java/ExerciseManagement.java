import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    // Constructor
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseList = new ArrayList<>();
        for (Exercise ex : this.exercises) {
            exerciseList.add(ex.getName());
        }
        return exerciseList;
    }
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    public void markAsCompleted(String exercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {
       for (Exercise ex : this.exercises) {
           if (ex.getName().equals(exercise)) {
               return ex.isCompleted();
           }
       }
       return false;
    }
}
