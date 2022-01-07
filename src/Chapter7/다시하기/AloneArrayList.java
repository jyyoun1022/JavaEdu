package Chapter7.다시하기;
import java.util.ArrayList;


public class AloneArrayList {
    public static void main(String[] args) {
        ArrayList<Student> stu =new ArrayList<Student>();

        stu.add(new Student(1001,"james"));
        stu.add(new Student(1002,"tomas"));
        stu.add(new Student(1003,"adward"));

        for(int i=0; i< stu.size(); i++){
            stu.get(i).showStudentInfo();
        }

    }
}
