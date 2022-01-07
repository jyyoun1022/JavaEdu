package Chapter6_2.staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이지원");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손수경");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentSon.studentName + "학번 : " + studentSon.studentID);

        Student2 studentYoun = new Student2();
        studentYoun.setStudentName("윤재열");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentYoun.studentName + "학번 : "+ studentYoun.studentID);
    }

}
