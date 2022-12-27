import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Wrote a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList() {
        management.add("Wrote a test");
        assertTrue(management.exerciseList().contains("Wrote a test"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertTrue(management.isCompleted("New Exercise"));
    }
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("Some Exercise");
        management.markAsCompleted("Some Exercise");
        assertFalse(management.isCompleted("Some other Exercise"));
    }
}
