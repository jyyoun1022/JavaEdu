package Chapter4;

public class BreakExercise {
    public static void main(String[] args) {
        int num;
        int sum=0;

        for(num=1; sum < 100; num++){
            sum += num;
            if(sum>=100)
           break;
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
