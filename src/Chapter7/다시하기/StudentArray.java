package Chapter7.다시하기;

public class StudentArray {
    public static void main(String[] args) {


        Student[] stu = new Student[3];


        stu[0] = new Student(1001, "james");
        stu[1] = new Student(1002,"tomas");
        stu[2] = new Student(1003,"adward");

        for(int i =0; i<stu.length; i++){
            stu[i].showStudentInfo();
        }
    }
}
