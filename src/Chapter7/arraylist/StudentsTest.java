package Chapter7.arraylist;

public class StudentsTest {
    public static void main(String[] args) {
        Student studentlee = new Student(1001,"Lee");
        studentlee.addSubject("국어",100);
        studentlee.addSubject("수학",50);

        Student studentKim = new Student(1002,"Kim");
        studentKim.addSubject("국어",70);
        studentKim.addSubject("수학",85);
        studentKim.addSubject("영어",100);

        studentlee.showStudentInfo();
        System.out.println("=========================================");
        studentKim.showStudentInfo();
    }
}
