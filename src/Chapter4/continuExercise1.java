package Chapter4;

public class continuExercise1 {
    public static void main(String[] args) {


        int num = 1;
        for (num = 1; num <= 100; num++) {
            if (num % 3 != 0)
                continue;
            System.out.println(num);
        }

    }
}