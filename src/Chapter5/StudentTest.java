package Chapter5;

public class StudentTest {
    public static void main(String[] args) {
//        Student studentAhn = new Student();
//        studentAhn.studentName ="안승연";
//
//        System.out.println(studentAhn.studentName);
//        System.out.println(studentAhn.getStudentName());


        Student student1 = new Student(); //첫번째 학생생성
        student1.studentName = "안연수";                       //서로 다른 인스턴스 생성(student1,student2)
        System.out.println(student1.getStudentName());
        Student student2 = new Student();   //두번째 학생생성
        student2.studentName = "안승연";
        System.out.println(student2.getStudentName());     //이처럼 인스턴스는 하나 이상 만들 수 있다.
    }
}
