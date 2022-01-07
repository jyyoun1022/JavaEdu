package Chapter5;

public class ExerciseTest {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.setStudentName("이상원",3);
        System.out.println(exercise.getStudentName() + exercise.grade);
        System.out.println(Exercise.studentID);
    }
}
