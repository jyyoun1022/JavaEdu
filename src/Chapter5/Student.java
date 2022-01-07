package Chapter5;

public class Student {
    int studentID;
    String studentName;    //멤버변수
    int grade;
    String address;

    @Override
    public String toString() {
        return studentName + "," + studentID;
    }

    public String getStudentName() {
        return studentName;                         //메소드 또는 멤버 함수라고 불린다.
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args){
        Student studentAhn = new Student();
        studentAhn.studentName ="안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }


    }

