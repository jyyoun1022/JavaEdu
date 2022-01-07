package Chapter7.다시하기;

public class StudentTest {
    public static void main(String[] args) {
        Student_ studentLee = new Student_(1001,"studentLee");
        studentLee.addSubject("국어",100);
        studentLee.addSubject("수학",50);

        Student_ studentKim = new Student_(1002, "studentKim");
        studentKim.addSubject("국어",70);
        studentKim.addSubject("수학",85);
        studentKim.addSubject("영어",100);

        studentLee.showStudentInfo();
        System.out.println("=================================");
        studentKim.showStudentInfo();
    }
}
