package Chapter6_2.staticex;

public class Student {
    public static int serialNum =1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
